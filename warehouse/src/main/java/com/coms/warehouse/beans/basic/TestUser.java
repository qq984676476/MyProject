package com.coms.warehouse.beans.basic;

import java.io.Serializable;


public class TestUser implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestUser(){
        super();
    }
}
