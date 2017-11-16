package com.lijia.common;

import com.lijia.common.result.Result;
import com.lijia.common.result.ResultEnum;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Desc:全局异常捕获并返回
 *
 */

@RestController
@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(Exception.class)
    public Result<Object> defaultExceptionHandler(HttpServletRequest request, Exception e)
            throws Exception {

        return new Result<>(ResultEnum.SERVER_ERROR,e.toString());
    }
}