package com.by.dubbo.admin.domain;

import java.util.Date;

public class Authorization {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.role_id
     *
     * @mbg.generated
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.role_name
     *
     * @mbg.generated
     */
    private String roleName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.role_auths
     *
     * @mbg.generated
     */
    private String roleAuths;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.user_name
     *
     * @mbg.generated
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.user_auths
     *
     * @mbg.generated
     */
    private String userAuths;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.operator_name
     *
     * @mbg.generated
     */
    private String operatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column authorization.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.id
     *
     * @return the value of authorization.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.id
     *
     * @param id the value for authorization.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.role_id
     *
     * @return the value of authorization.role_id
     *
     * @mbg.generated
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.role_id
     *
     * @param roleId the value for authorization.role_id
     *
     * @mbg.generated
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.role_name
     *
     * @return the value of authorization.role_name
     *
     * @mbg.generated
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.role_name
     *
     * @param roleName the value for authorization.role_name
     *
     * @mbg.generated
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.role_auths
     *
     * @return the value of authorization.role_auths
     *
     * @mbg.generated
     */
    public String getRoleAuths() {
        return roleAuths;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.role_auths
     *
     * @param roleAuths the value for authorization.role_auths
     *
     * @mbg.generated
     */
    public void setRoleAuths(String roleAuths) {
        this.roleAuths = roleAuths == null ? null : roleAuths.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.user_id
     *
     * @return the value of authorization.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.user_id
     *
     * @param userId the value for authorization.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.user_name
     *
     * @return the value of authorization.user_name
     *
     * @mbg.generated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.user_name
     *
     * @param userName the value for authorization.user_name
     *
     * @mbg.generated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.user_auths
     *
     * @return the value of authorization.user_auths
     *
     * @mbg.generated
     */
    public String getUserAuths() {
        return userAuths;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.user_auths
     *
     * @param userAuths the value for authorization.user_auths
     *
     * @mbg.generated
     */
    public void setUserAuths(String userAuths) {
        this.userAuths = userAuths == null ? null : userAuths.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.create_time
     *
     * @return the value of authorization.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.create_time
     *
     * @param createTime the value for authorization.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.update_time
     *
     * @return the value of authorization.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.update_time
     *
     * @param updateTime the value for authorization.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.operator
     *
     * @return the value of authorization.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.operator
     *
     * @param operator the value for authorization.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.operator_name
     *
     * @return the value of authorization.operator_name
     *
     * @mbg.generated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.operator_name
     *
     * @param operatorName the value for authorization.operator_name
     *
     * @mbg.generated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column authorization.status
     *
     * @return the value of authorization.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column authorization.status
     *
     * @param status the value for authorization.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}