package com.veesing.common.aspect;

import com.veesing.common.annotation.Log;
import com.veesing.common.dao.LogDao;
import com.veesing.common.domain.LogDO;
import com.veesing.common.utils.HttpContextUtils;
import com.veesing.common.utils.IPUtils;
import com.veesing.common.utils.JSONUtils;
import com.veesing.common.utils.ShiroUtils;
import com.veesing.system.domain.UserDO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Date;


@Aspect
@Component
public class LogAspect {

	LogDao logMapper;

	public LogAspect(LogDao logMapper) {
		this.logMapper = logMapper;
	}

	@Pointcut("@annotation(com.veesing.common.annotation.Log)")
	public void logPointCut() {
	}


	@Around("logPointCut()")
	public Object around(ProceedingJoinPoint point) throws Throwable {
		long beginTime = System.currentTimeMillis();
		Object result = point.proceed();
		long time = System.currentTimeMillis() - beginTime;
		saveLog(point, time);
		return result;

	}


	private void saveLog(ProceedingJoinPoint joinPoint, long time) {
		try {
			MethodSignature signature = (MethodSignature) joinPoint.getSignature();
			Method method = signature.getMethod();
			LogDO sysLog = new LogDO();
			Log syslog = method.getAnnotation(Log.class);
			if (syslog != null) {
				sysLog.setOperation(syslog.value());
			}
			String className = joinPoint.getTarget().getClass().getName();
			String methodName = signature.getName();
			sysLog.setMethod(className + "." + methodName + "()");
			Object[] args = joinPoint.getArgs();
			try {
				String params = JSONUtils.beanToJson(args[0]);
				if(params.length()>4000){
					params=params.substring(0, 4000);
				}
				sysLog.setParams(params);
			} catch (Exception ignored) {
			}
			HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
			sysLog.setIp(IPUtils.getIpAddr(request));
			UserDO currUser = ShiroUtils.getUser();
			if (null == currUser) {
				if (null != sysLog.getParams()) {
					sysLog.setUserId(-1L);
					if (sysLog.getParams().length() >= 50) {
						sysLog.setUsername(sysLog.getParams().substring(0, 50));
					} else {
						sysLog.setUsername(sysLog.getParams());
					}
				} else {
					sysLog.setUserId(-1L);
					sysLog.setUsername("获取用户信息为空");
				}
			} else {
				sysLog.setUserId(ShiroUtils.getUserId());
				sysLog.setUsername(ShiroUtils.getUser().getUsername());
			}
			sysLog.setTime((int) time);
			Date date = new Date();
			sysLog.setGmtCreate(date);
			logMapper.save(sysLog);
		} catch (Exception ignored) {
		}
	}

}
