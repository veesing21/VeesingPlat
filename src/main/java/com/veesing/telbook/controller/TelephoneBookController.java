package com.veesing.telbook.controller;

import com.veesing.common.utils.PageUtils;
import com.veesing.common.utils.Query;
import com.veesing.common.utils.R;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.telbook.domain.TelephoneBookDO;
import com.veesing.telbook.domain.TelephoneBookGroupDO;
import com.veesing.telbook.service.TelephoneBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/telephoneBook")
public class TelephoneBookController {

	TelephoneBookService telephoneBookService;

	public TelephoneBookController(TelephoneBookService telephoneBookService) {
		this.telephoneBookService = telephoneBookService;
	}

	@GetMapping("/listGroups")
	PageUtils listGroups(@RequestParam Map<String, Object> params) {
		params.put("customerId", ShiroUtils.getCustomerId());
		Query query = new Query(params);
		List<TelephoneBookGroupDO> list = telephoneBookService.listGroups(query);
		int total = telephoneBookService.countGroups(query);
		return new PageUtils(list, total);
	}

	@PostMapping("/saveGroup")
	R saveGroup(TelephoneBookGroupDO group) {
		return R.error("演示版本");
	}

	@PostMapping("/updateGroup")
	R updateGroup(TelephoneBookGroupDO group) {
		return R.error("演示版本");
	}

	@PostMapping("/removeGroup")
	R removeGroup(Long id) {
		return R.error("演示版本");
	}

	@PostMapping("/batchRemoveGroups")
	R batchRemoveGroups(@RequestParam("ids[]") Long[] ids) {
		return R.error("演示版本");
	}

	@GetMapping("/listPhones")
	PageUtils listPhones(@RequestParam Map<String, Object> params) {
		params.put("customerId", ShiroUtils.getCustomerId());
		Query query = new Query(params);
		List<TelephoneBookDO> list = telephoneBookService.listPhones(query);
		int total = telephoneBookService.listPhoneCount(query);
		return new PageUtils(list, total);
	}

	@PostMapping("/batchSavePhones")
	R batchSavePhones(@RequestParam Map<String, Object> params) {
		return R.error("演示版本");
	}


	@PostMapping("/removePhone")
	R removePhone(Long id) {
		return R.error("演示版本");
	}

	@PostMapping("/batchRemovePhones")
	R batchRemovePhones(@RequestParam("ids[]") Long[] ids) {
		return R.error("演示版本");
	}

	@PostMapping("/updatePhone")
	R updatePhone(TelephoneBookDO phone) {
		return R.error("演示版本");
	}

	@PostMapping("/telephoneBookSave")
	R addTelephoneBook(TelephoneBookDO telephoneBook) {

		return R.error("演示版本");
	}

}
