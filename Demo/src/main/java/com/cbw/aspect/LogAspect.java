package com.cbw.aspect;

import java.util.Arrays;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.cbw.dto.IBSLog;
import com.cbw.mappers.IBSLogMapper;
import com.cbw.service.IBSLogService;

/**
 * 对类进行切片
 * @author cbw
 *
 */
@Aspect
@Component
public class LogAspect {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(LogAspect.class);
	
	@Autowired
	private IBSLogService ibsLogService;

    ThreadLocal<Long> startTime = new ThreadLocal<>();
	
    @Pointcut("execution(public * com.cbw.controller.*.*(..))")  
    public void webLog(){}  

	    @Before("webLog()")
	    public void doBefore(JoinPoint joinPoint) throws Throwable {
	        startTime.set(System.currentTimeMillis());

	        // 接收到请求，记录请求内容
	        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
	        HttpServletRequest request = attributes.getRequest();

	        // 记录下请求内容
	        logger.info("URL : " + request.getRequestURL().toString());
	        logger.info("HTTP_METHOD : " + request.getMethod());
	        logger.info("IP : " + request.getRemoteAddr());
	        logger.info("CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
	        logger.info("ARGS : " + Arrays.toString(joinPoint.getArgs()));

	        String message = "URL : " + request.getRequestURL().toString() 
	        		+"----HTTP_METHOD : " + request.getMethod()
	        		+"----IP : " + request.getRemoteAddr()
	        		+"----CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName()
	        		+"----ARGS : " + Arrays.toString(joinPoint.getArgs())
	        		;
	        
	        IBSLog record = new IBSLog();
	        record.setLogDate(new Date());
	        record.setLogLevel("info");
	        record.setLogMessage(message);
	        
	        ibsLogService.insert(record);
	        
	    }

	    @AfterReturning(returning = "ret", pointcut = "webLog()")
	    public void doAfterReturning(Object ret) throws Throwable {
	        // 处理完请求，返回内容
	    	
	        logger.info("RESPONSE : " + ret);
	        logger.info("SPEND TIME : " + (System.currentTimeMillis() - startTime.get()));
	    }

}
