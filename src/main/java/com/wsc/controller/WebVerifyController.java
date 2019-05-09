package com.wsc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/login/*")
public class WebVerifyController {


    //提供验证码
    @RequestMapping("verifyCode")
    public String verifyCode(HttpServletRequest request) {
        request.getSession().setAttribute("verifyCode", "N7GX");
        return request.getSession().getId() + ":" + request.getSession().getAttribute("verifyCode");
    }

    //核对验证码
    @RequestMapping("checkVerifyCode")
    public String checkVerifyCode(HttpServletRequest request) {
        return request.getSession().getId() + ":" + request.getSession().getAttribute("verifyCode");
    }


}
