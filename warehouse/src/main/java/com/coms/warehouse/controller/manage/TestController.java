package com.coms.warehouse.controller.manage;

import com.coms.warehouse.beans.basic.TestUser;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestController {
    @RequestMapping("getuser")
    public TestUser getUser() {
        TestUser user = new TestUser();
        user.setName("222");
        return user;
    }
}
