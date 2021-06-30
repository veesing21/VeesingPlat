package com.veesing.sms.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.sms.domain.CustomTemplateDO;
import com.veesing.sms.service.CustomTemplateService;
import com.veesing.trigmsg.domain.SysTemplateTypeDO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sms/custom/template")
public class CustomTemplateController {

	CustomTemplateService customTemplateService;

	public CustomTemplateController(CustomTemplateService customTemplateService) {
		this.customTemplateService = customTemplateService;
	}

	@GetMapping("/list")
	PageUtils list(@RequestParam Map<String, Object> params) {
		params.put("customerId", ShiroUtils.getCustomerId());
		Query query = new Query(params);
		List<CustomTemplateDO> templateList = customTemplateService.list(query);
		int total = customTemplateService.count(query);
		return new PageUtils(templateList, total);
	}

	@PostMapping("/save")
	R save(CustomTemplateDO template,HttpServletRequest request) {
		return R.error("演示版本");
	}

	@GetMapping("/get")
	CustomTemplateDO get(Long id) {
		return customTemplateService.get(id);
	}

	@PostMapping("/update")
	R update(CustomTemplateDO template) {
		return R.error("演示版本");
	}

	@PostMapping("/remove")
	R remove(long id) {
		return R.error("演示版本");
	}

	@PostMapping("/batchRemove")
	R batchRemove(@RequestParam("ids[]") Long[] ids) {
		return R.error("演示版本");
	}

	@GetMapping("/listTypes")
	List<SysTemplateTypeDO> listTemplateTypes() {
		return customTemplateService.listTemplateTypes();
	}
}
