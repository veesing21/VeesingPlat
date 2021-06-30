package com.veesing.system.controller;

import com.veesing.common.utils.R;
import com.veesing.system.service.SecurityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/sys/security")
public class SecurityController {

	SecurityService securityService;

	public SecurityController(SecurityService securityService) {
		this.securityService = securityService;
	}


	@GetMapping("/list")
	String list(Integer pdType) {
		return securityService.list(pdType);
	}

	@PostMapping("/update")
	R update(String json) {
		return R.error("演示版本");
	}


}
