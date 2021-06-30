package com.veesing.mms.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.customer.domain.CustomerDO;
import com.veesing.mms.domain.MmsTemplateDO;
import com.veesing.mms.service.MmsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@RestController
@RequestMapping("/mms/group")
public class MmsController {

	MmsService mmsService;

	public MmsController(MmsService mmsService) {
		this.mmsService = mmsService;
	}

	@GetMapping("/deleteMmsTemplate")
	public R deleteMmsTemplate(long id) {
		return R.error("演示版本");
	}

	@PostMapping("/handleMmsTemplate")
	public R handleMmsTemplate(MmsTemplateDO template, HttpServletRequest request) {
		return R.error("演示版本");
	}

	@GetMapping("/listMmsTemplate")
	public PageUtils listMmsTemplate(@RequestParam Map<String, Object> map) {
		CustomerDO customer = ShiroUtils.getCustomer();
		map.put("customerId", customer.getId());
		Query query = new Query(map);
		return new PageUtils(mmsService.listTemplate(query), mmsService.countTemplate(query));
	}

	@RequestMapping("/submit")
	R submit(HttpServletRequest request,String jobTime,int pdType,long mmsId,String phones) {
		return R.error("演示版本");
	}

}
