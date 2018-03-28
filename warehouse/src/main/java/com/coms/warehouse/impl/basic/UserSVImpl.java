package com.coms.warehouse.impl.basic;

import com.coms.warehouse.beans.basic.TUser;
import com.coms.warehouse.dao.basic.TUserDAO;
import com.coms.warehouse.service.basic.ITUserSV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSVImpl implements ITUserSV{

    @Autowired
    private TUserDAO userDAO;

    @Override
    public TUser getUserInfo(TUser user) {
        TUser resultUser =  userDAO.getBySelective(user);
        return resultUser;
    }
}
