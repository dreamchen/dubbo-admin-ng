package com.by.dubbo.admin.domain;

import java.util.Date;

public class Permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.permit_name
     *
     * @mbg.generated
     */
    private String permitName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.permit_key
     *
     * @mbg.generated
     */
    private String permitKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.permit_desc
     *
     * @mbg.generated
     */
    private String permitDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.operator_name
     *
     * @mbg.generated
     */
    private String operatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.id
     *
     * @return the value of permission.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.id
     *
     * @param id the value for permission.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.permit_name
     *
     * @return the value of permission.permit_name
     *
     * @mbg.generated
     */
    public String getPermitName() {
        return permitName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.permit_name
     *
     * @param permitName the value for permission.permit_name
     *
     * @mbg.generated
     */
    public void setPermitName(String permitName) {
        this.permitName = permitName == null ? null : permitName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.permit_key
     *
     * @return the value of permission.permit_key
     *
     * @mbg.generated
     */
    public String getPermitKey() {
        return permitKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.permit_key
     *
     * @param permitKey the value for permission.permit_key
     *
     * @mbg.generated
     */
    public void setPermitKey(String permitKey) {
        this.permitKey = permitKey == null ? null : permitKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.permit_desc
     *
     * @return the value of permission.permit_desc
     *
     * @mbg.generated
     */
    public String getPermitDesc() {
        return permitDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.permit_desc
     *
     * @param permitDesc the value for permission.permit_desc
     *
     * @mbg.generated
     */
    public void setPermitDesc(String permitDesc) {
        this.permitDesc = permitDesc == null ? null : permitDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.create_time
     *
     * @return the value of permission.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.create_time
     *
     * @param createTime the value for permission.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.update_time
     *
     * @return the value of permission.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.update_time
     *
     * @param updateTime the value for permission.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.operator
     *
     * @return the value of permission.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.operator
     *
     * @param operator the value for permission.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.operator_name
     *
     * @return the value of permission.operator_name
     *
     * @mbg.generated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.operator_name
     *
     * @param operatorName the value for permission.operator_name
     *
     * @mbg.generated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.status
     *
     * @return the value of permission.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.status
     *
     * @param status the value for permission.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}