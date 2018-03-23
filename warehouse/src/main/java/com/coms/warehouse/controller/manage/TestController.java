package com.coms.warehouse.controller.manage;

import com.coms.warehouse.bean.basic.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestController {
    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("222");
        return user;
    }
}
