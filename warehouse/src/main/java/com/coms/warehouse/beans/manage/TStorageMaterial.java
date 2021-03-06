package com.coms.warehouse.beans.manage;

import java.util.Date;

public class TStorageMaterial {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_id
     *
     * @mbggenerated
     */
    private Integer partId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_name
     *
     * @mbggenerated
     */
    private String partName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_size
     *
     * @mbggenerated
     */
    private String partSize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.mate_type2
     *
     * @mbggenerated
     */
    private Byte mateType2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_count
     *
     * @mbggenerated
     */
    private Float partCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_price
     *
     * @mbggenerated
     */
    private Float partPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_totle
     *
     * @mbggenerated
     */
    private Float partTotle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_batch_code
     *
     * @mbggenerated
     */
    private String partBatchCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.part_user_id
     *
     * @mbggenerated
     */
    private Integer partUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.crt_time
     *
     * @mbggenerated
     */
    private Date crtTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.modf_time
     *
     * @mbggenerated
     */
    private Date modfTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.Product_status
     *
     * @mbggenerated
     */
    private Byte productStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.out_time
     *
     * @mbggenerated
     */
    private Date outTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_storage_material.op_person
     *
     * @mbggenerated
     */
    private Integer opPerson;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_storage_material
     *
     * @mbggenerated
     */
    public TStorageMaterial(Integer partId, String partName, String partSize, Byte mateType2, Float partCount, Float partPrice, Float partTotle, String partBatchCode, Integer partUserId, Date crtTime, Date modfTime, Byte productStatus, Date outTime, Integer opPerson) {
        this.partId = partId;
        this.partName = partName;
        this.partSize = partSize;
        this.mateType2 = mateType2;
        this.partCount = partCount;
        this.partPrice = partPrice;
        this.partTotle = partTotle;
        this.partBatchCode = partBatchCode;
        this.partUserId = partUserId;
        this.crtTime = crtTime;
        this.modfTime = modfTime;
        this.productStatus = productStatus;
        this.outTime = outTime;
        this.opPerson = opPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_id
     *
     * @return the value of t_storage_material.part_id
     *
     * @mbggenerated
     */
    public Integer getPartId() {
        return partId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_name
     *
     * @return the value of t_storage_material.part_name
     *
     * @mbggenerated
     */
    public String getPartName() {
        return partName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_size
     *
     * @return the value of t_storage_material.part_size
     *
     * @mbggenerated
     */
    public String getPartSize() {
        return partSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.mate_type2
     *
     * @return the value of t_storage_material.mate_type2
     *
     * @mbggenerated
     */
    public Byte getMateType2() {
        return mateType2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_count
     *
     * @return the value of t_storage_material.part_count
     *
     * @mbggenerated
     */
    public Float getPartCount() {
        return partCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_price
     *
     * @return the value of t_storage_material.part_price
     *
     * @mbggenerated
     */
    public Float getPartPrice() {
        return partPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_totle
     *
     * @return the value of t_storage_material.part_totle
     *
     * @mbggenerated
     */
    public Float getPartTotle() {
        return partTotle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_batch_code
     *
     * @return the value of t_storage_material.part_batch_code
     *
     * @mbggenerated
     */
    public String getPartBatchCode() {
        return partBatchCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.part_user_id
     *
     * @return the value of t_storage_material.part_user_id
     *
     * @mbggenerated
     */
    public Integer getPartUserId() {
        return partUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.crt_time
     *
     * @return the value of t_storage_material.crt_time
     *
     * @mbggenerated
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.modf_time
     *
     * @return the value of t_storage_material.modf_time
     *
     * @mbggenerated
     */
    public Date getModfTime() {
        return modfTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.Product_status
     *
     * @return the value of t_storage_material.Product_status
     *
     * @mbggenerated
     */
    public Byte getProductStatus() {
        return productStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.out_time
     *
     * @return the value of t_storage_material.out_time
     *
     * @mbggenerated
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_storage_material.op_person
     *
     * @return the value of t_storage_material.op_person
     *
     * @mbggenerated
     */
    public Integer getOpPerson() {
        return opPerson;
    }
}