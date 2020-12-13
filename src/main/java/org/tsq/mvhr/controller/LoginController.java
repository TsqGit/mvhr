package org.tsq.mvhr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tsq.mvhr.model.RespBean;

@RestController
public class LoginController {
    @GetMapping("/login")
    public RespBean login() {
        return RespBean.error("请先登录！");
    }
}
