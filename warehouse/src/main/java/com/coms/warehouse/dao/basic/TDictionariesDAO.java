package com.coms.warehouse.dao.basic;

import com.coms.warehouse.beans.basic.TDictionaries;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TDictionariesDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    int insert(TDictionaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    int insertSelective(TDictionaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    TDictionaries selectByPrimaryKey(Integer dicId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TDictionaries record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_dictionaries
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TDictionaries record);
}