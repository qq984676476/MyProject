package com.coms.warehouse.base.common;

import java.io.Serializable;
import java.util.Collection;

public class Result {

    private Collection Beans;
    private Result.Bean bean;
    private Object object;
    private int totalCount;
    private String returnMessage;
    private String returnCode;

    public Result(String returnCode, String returnMessage) {
        this.returnCode = returnCode;
        this.returnMessage = returnMessage;
    }

    public Result(){

    }
    public Result(Collection beans, Bean bean, Object object, int totalCount, String returnMessage, String returnCode) {
        Beans = beans;
        this.bean = bean;
        this.object = object;
        this.totalCount = totalCount;
        this.returnMessage = returnMessage;
        this.returnCode = returnCode;
    }

    public Collection getBeans() {
        return Beans;
    }

    public void setBeans(Collection beans) {
        Beans = beans;
    }

    public Bean getBean() {
        return bean;
    }

    public void setBean(Bean bean) {
        this.bean = bean;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public static class Bean implements Serializable {
        int total = 0;

        public Bean(int total) {
            this.total = total;
        }

        public int getTotal() {
            return this.total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }
}
