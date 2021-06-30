package com.veesing.sms.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.sms.domain.SmsTemplateDO;
import com.veesing.sms.service.SmsTemplateService;
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
@RequestMapping("/sms/template")
public class SmsTemplateController {


	SmsTemplateService smsTemplateService;

	public SmsTemplateController(SmsTemplateService smsTemplateService) {
		this.smsTemplateService = smsTemplateService;
	}

	@PostMapping("/save")
	R save(SmsTemplateDO template,HttpServletRequest request) {
		return R.error("演示版本");
	}

	@GetMapping("/list")
	PageUtils list(@RequestParam Map<String, Object> params) {
		params.put("customerId", ShiroUtils.getCustomerId());
		Query query = new Query(params);
		List<SmsTemplateDO> templateList = smsTemplateService.list(query);
		int total = smsTemplateService.count(query);
		return new PageUtils(templateList, total);
	}

	@GetMapping("/get")
	SmsTemplateDO get(Long id) {
		return smsTemplateService.get(id);
	}

	@PostMapping("/update")
	R update(SmsTemplateDO template) {
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
		return smsTemplateService.listTemplateTypes();
	}

}
