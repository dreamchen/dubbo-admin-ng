package com.by.dubbo.admin.dao.mapper;

import com.by.dubbo.admin.domain.Authorization;

public interface AuthorizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    int insert(Authorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    int insertSelective(Authorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    Authorization selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Authorization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table authorization
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Authorization record);
}