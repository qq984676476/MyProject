package com.coms.warehouse.bean.basic;

import org.springframework.stereotype.Component;

import java.io.Serializable;


public class User implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User (){
        super();
    }
}
