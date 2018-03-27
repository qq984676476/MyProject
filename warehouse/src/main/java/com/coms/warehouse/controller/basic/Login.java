package com.coms.warehouse.controller.basic;

import com.coms.warehouse.beans.basic.TUser;
import com.coms.warehouse.service.basic.ITUserSV;
import com.coms.warehouse.util.ValidateImage;
import com.sun.tools.internal.ws.processor.generator.GeneratorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "index")
public class Login {

    @Autowired
    private ITUserSV userSV;
    @RequestMapping(value = "login")
    public String getVerificationCode(){
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++开始了");
        return "modules/basic/login";
    }

    @RequestMapping(value = "verificationCode")
    public Map verificationCode(){
        Map resultMap = ValidateImage.createImage();
        return resultMap;
    }

    @RequestMapping(value = "doLogin")
    public String doLogin(TUser user) throws GeneratorException{

        TUser userParam = new TUser();
        List<TUser> users = userSV.getUserInfo(user);
        if(users!=null && users.isEmpty()){
            throw new GeneratorException("账号或密码错误");
        };

        return "";
    }
}
