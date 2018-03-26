package com.coms.warehouse.beans.basic;

import java.util.Date;

public class TDictionaries {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.dic_id
     *
     * @mbggenerated
     */
    private Integer dicId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.dic_code
     *
     * @mbggenerated
     */
    private String dicCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.dic_type
     *
     * @mbggenerated
     */
    private Byte dicType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.dic_name
     *
     * @mbggenerated
     */
    private String dicName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.op_person
     *
     * @mbggenerated
     */
    private Integer opPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.crt_time
     *
     * @mbggenerated
     */
    private Date crtTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.modf_time
     *
     * @mbggenerated
     */
    private Date modfTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dictionaries.rmk
     *
     * @mbggenerated
     */
    private String rmk;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    public TDictionaries(Integer dicId, String dicCode, Byte dicType, String dicName, Integer opPerson, Date crtTime, Date modfTime, String rmk) {
        this.dicId = dicId;
        this.dicCode = dicCode;
        this.dicType = dicType;
        this.dicName = dicName;
        this.opPerson = opPerson;
        this.crtTime = crtTime;
        this.modfTime = modfTime;
        this.rmk = rmk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.dic_id
     *
     * @return the value of t_dictionaries.dic_id
     *
     * @mbggenerated
     */
    public Integer getDicId() {
        return dicId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.dic_code
     *
     * @return the value of t_dictionaries.dic_code
     *
     * @mbggenerated
     */
    public String getDicCode() {
        return dicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.dic_type
     *
     * @return the value of t_dictionaries.dic_type
     *
     * @mbggenerated
     */
    public Byte getDicType() {
        return dicType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.dic_name
     *
     * @return the value of t_dictionaries.dic_name
     *
     * @mbggenerated
     */
    public String getDicName() {
        return dicName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.op_person
     *
     * @return the value of t_dictionaries.op_person
     *
     * @mbggenerated
     */
    public Integer getOpPerson() {
        return opPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.crt_time
     *
     * @return the value of t_dictionaries.crt_time
     *
     * @mbggenerated
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.modf_time
     *
     * @return the value of t_dictionaries.modf_time
     *
     * @mbggenerated
     */
    public Date getModfTime() {
        return modfTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dictionaries.rmk
     *
     * @return the value of t_dictionaries.rmk
     *
     * @mbggenerated
     */
    public String getRmk() {
        return rmk;
    }
}