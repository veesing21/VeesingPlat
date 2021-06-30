package com.veesing.common.exception;

import com.veesing.common.utils.ShiroUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.UnauthorizedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.veesing.common.utils.R;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class VsExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@ExceptionHandler(VsException.class)
	public R handleVsException(VsException e) {
		R r = new R();
		r.put("code", e.getCode());
		r.put("msg", e.getMessage());

		return r;
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	@ResponseBody
	public R handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e){
		logger.error("HttpRequestMethodNotSupportedException ",e.getMessage());
		return R.error(e.getMessage());
	}

	@ExceptionHandler(DuplicateKeyException.class)
	@ResponseBody
	public R handleDuplicateKeyException(DuplicateKeyException e) {
		logger.error(e.getMessage(), e);
		return R.error("数据库中已存在该记录");
	}

	@ExceptionHandler(org.springframework.web.servlet.NoHandlerFoundException.class)
	@ResponseBody
	public R noHandlerFoundException(org.springframework.web.servlet.NoHandlerFoundException e) {
		logger.error(e.getMessage(), e);
		return R.error("没找找到页面");
	}

	@ExceptionHandler(AuthorizationException.class)
	public String handleAuthorizationException(AuthorizationException e) {
		logger.error(e.getMessage(), e);
		return "error/403";
	}

	@ExceptionHandler(value = UnauthorizedException.class)
	public String defaultErrorHandler(UnauthorizedException e)  {
		logger.error("UnauthorizedException msg={}, userId={}, cause={}",e.getMessage(),ShiroUtils.getUserId(),e.getCause().toString());
		return "error/403";
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception e) {
		logger.error(e.getMessage(), e);
		return "error/500";
	}

}
