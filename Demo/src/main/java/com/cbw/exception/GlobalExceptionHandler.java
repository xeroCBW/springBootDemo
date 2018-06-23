package com.cbw.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cbw.error.ErrorInfo;

/**
 * MyException的错误
 * @author cbw
 *
 */
@RestControllerAdvice
//@ControllerAdvice是一个@Component，用于定义@ExceptionHandler，@InitBinder和@ModelAttribute方法，适用于所有使用@RequestMapping方法。
public class GlobalExceptionHandler {

	
	//定义用于myException的错误
	//我们还可以定义其他的类的错误
	@ExceptionHandler(value = MyException.class)
    @ResponseBody 
    public ErrorInfo<String> jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        ErrorInfo<String> r = new ErrorInfo<>();
        r.setMessage(e.getMessage());
        r.setCode(ErrorInfo.ERROR);
        r.setData("Some Data");
        r.setUrl(req.getRequestURL().toString());
        return r;
    }
	
	
	
	/**
	 * 自定义用于OtherException其他错误的
	 * 注意handler传入的参数,一定要是otherHandler传进来的,用myException;可能接受不到参数
	 * @param req
	 * @param e
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(value = OtherException.class)
    @ResponseBody 
	 public ErrorInfo<String> otherErrorHandler(HttpServletRequest req, OtherException e) throws Exception {
	        ErrorInfo<String> r = new ErrorInfo<>();
	        r.setMessage(e.getMessage());
	        r.setCode(ErrorInfo.ERROR);
	        r.setData("Some Data");
	        r.setUrl(req.getRequestURL().toString());
	        return r;
	    }
}
