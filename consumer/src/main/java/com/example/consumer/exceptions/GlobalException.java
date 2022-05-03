package com.example.consumer.exceptions;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.consumer.controller.vo.ResponseVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SessionException;
import java.io.IOException;


/**
 * @program: dubbo_learn
 * @description:
 * @author: mjw
 * @create: 2022-05-02 20:14
 */
@Slf4j
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(MockException.class)
    public void myException(HttpServletRequest request, HttpServletResponse response, Exception ex) throws IOException {
        ex.printStackTrace();
        ResponseVo result = new ResponseVo();
        if (ex instanceof MockException) {
            result.setResult(300);
            result.setMessage(ex.getMessage() == null ? "请先登录" : ex.getMessage());
        } else {
            result.setResult(400);
            result.setMessage(ex.getMessage() == null ? "系统异常,请联系客服" : ex.getMessage());
        }
        log.error("限流异常信息", ex);
        response.setContentType("application/json;charset=UTF-8");
        byte[] bytes = JSON.toJSONBytes(result, SerializerFeature.DisableCircularReferenceDetect);
        response.getOutputStream().write(bytes);
        response.getOutputStream().close();
    }
}
