package com.veesing.common.controller;

import com.veesing.common.config.VeesingConfig;
import com.veesing.common.domain.FileDO;
import com.veesing.common.service.FileService;
import com.veesing.common.utils.Base64Util;
import com.veesing.common.utils.FileTypeUtils;
import com.veesing.common.utils.FileUtil;
import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/common/sysFile")
public class FileController extends BaseController {

    FileService sysFileService;

    VeesingConfig veesingConfig;

    public FileController(FileService sysFileService, VeesingConfig veesingConfig) {
        this.sysFileService = sysFileService;
        this.veesingConfig = veesingConfig;
    }



    @GetMapping("/list")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<FileDO> sysFileList = sysFileService.list(query);
        int total = sysFileService.count(query);
        return new PageUtils(sysFileList, total);
    }



    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        FileDO sysFile = sysFileService.get(id);
        return R.ok().put("sysFile", sysFile);
    }


    @PostMapping("/save")
    public R save(FileDO sysFile) {
        if (sysFileService.save(sysFile) > 0) {
            return R.ok();
        }
        return R.error();
    }

    @RequestMapping("/update")
    public R update(@RequestBody FileDO sysFile) {
        sysFileService.update(sysFile);
        return R.ok();
    }

    @PostMapping("/remove")
    public R remove(Long id, HttpServletRequest request) {
        String fileName = veesingConfig.getUploadPath() + sysFileService.get(id).getUrl().replace("/files/", "");
        if (sysFileService.remove(id) > 0) {
            boolean b = FileUtil.deleteFile(fileName);
            if (!b) {
                return R.error("数据库记录删除成功，文件删除失败");
            }
            return R.ok();
        } else {
            return R.error();
        }
    }

    @PostMapping("/batchRemove")
    public R remove(@RequestParam("ids[]") Long[] ids) {
        sysFileService.batchRemove(ids);
        return R.ok();
    }

    @PostMapping("/upload")
    R upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        String fileName = file.getOriginalFilename();
        fileName = FileUtil.renameToUUID(fileName);
        FileDO sysFile = new FileDO(FileTypeUtils.fileType(fileName), "/files/" + fileName, new Date());
        try {
            FileUtil.uploadFile(file.getBytes(), veesingConfig.getUploadPath(), fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return R.error();
        }

        if (sysFileService.save(sysFile) > 0) {
            return R.ok().put("fileName", sysFile.getUrl());
        }
        return R.error();
    }

    @ResponseBody
    @PostMapping("/uploadScreenshot")
    R uploadbase64(String base64Str) {
        String fileName = FileUtil.renameToUUID("x.jpeg");
        try {
            Base64Util.decode2File(veesingConfig.getUploadPath(), base64Str, fileName);
            return R.ok().put("fileName", "/files/" + fileName);
        } catch (Exception e) {
            return R.error();
        }
    }
}
