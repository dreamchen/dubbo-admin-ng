package com.by.dubbo.admin.dao.mapper;

import com.by.dubbo.admin.domain.Service;

public interface ServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    int insert(Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    int insertSelective(Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    Service selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table service
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Service record);
}