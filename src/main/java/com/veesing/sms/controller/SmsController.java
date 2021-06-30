package com.veesing.sms.controller;

import com.veesing.common.utils.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@RequestMapping("/sms/group")
public class SmsController {

	@PostMapping("/submit")
	R save(@RequestParam Map<String, Object> map, HttpServletRequest request) {
		return R.error("演示版本");
	}
}
