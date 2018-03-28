package com.coms.warehouse.controller.basic;

import com.coms.warehouse.beans.basic.TUser;
import com.coms.warehouse.service.basic.ITUserSV;
import com.coms.warehouse.util.ValidateImage;
import com.sun.tools.internal.ws.processor.generator.GeneratorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
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
    public Map<String, Object> doLogin(HttpServletRequest request,TUser user) throws GeneratorException{
        TUser loginUser = userSV.getUserInfo(user);
        if(loginUser == null){
            throw new GeneratorException("账号或密码错误");
        };
        HttpSession session = request.getSession();
        session.setAttribute("userInfo",loginUser);
        session.setMaxInactiveInterval(3600);
        Map resultMap = new HashMap();
        resultMap.put("userInfo",loginUser);
        resultMap.put("indexUrl", "index");

        return resultMap;
    }
}
