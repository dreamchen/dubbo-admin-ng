package com.by.dubbo.admin.domain;

import java.util.Date;

public class Service {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_name
     *
     * @mbg.generated
     */
    private String serviceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_alias
     *
     * @mbg.generated
     */
    private String serviceAlias;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_desc
     *
     * @mbg.generated
     */
    private String serviceDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_principal
     *
     * @mbg.generated
     */
    private String servicePrincipal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.service_principal_name
     *
     * @mbg.generated
     */
    private String servicePrincipalName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.app_id
     *
     * @mbg.generated
     */
    private Integer appId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.app_name
     *
     * @mbg.generated
     */
    private String appName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.operator_name
     *
     * @mbg.generated
     */
    private String operatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.approval_status
     *
     * @mbg.generated
     */
    private String approvalStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.is_alert
     *
     * @mbg.generated
     */
    private String isAlert;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column service.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.id
     *
     * @return the value of service.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.id
     *
     * @param id the value for service.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_name
     *
     * @return the value of service.service_name
     *
     * @mbg.generated
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_name
     *
     * @param serviceName the value for service.service_name
     *
     * @mbg.generated
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_alias
     *
     * @return the value of service.service_alias
     *
     * @mbg.generated
     */
    public String getServiceAlias() {
        return serviceAlias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_alias
     *
     * @param serviceAlias the value for service.service_alias
     *
     * @mbg.generated
     */
    public void setServiceAlias(String serviceAlias) {
        this.serviceAlias = serviceAlias == null ? null : serviceAlias.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_desc
     *
     * @return the value of service.service_desc
     *
     * @mbg.generated
     */
    public String getServiceDesc() {
        return serviceDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_desc
     *
     * @param serviceDesc the value for service.service_desc
     *
     * @mbg.generated
     */
    public void setServiceDesc(String serviceDesc) {
        this.serviceDesc = serviceDesc == null ? null : serviceDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_principal
     *
     * @return the value of service.service_principal
     *
     * @mbg.generated
     */
    public String getServicePrincipal() {
        return servicePrincipal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_principal
     *
     * @param servicePrincipal the value for service.service_principal
     *
     * @mbg.generated
     */
    public void setServicePrincipal(String servicePrincipal) {
        this.servicePrincipal = servicePrincipal == null ? null : servicePrincipal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.service_principal_name
     *
     * @return the value of service.service_principal_name
     *
     * @mbg.generated
     */
    public String getServicePrincipalName() {
        return servicePrincipalName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.service_principal_name
     *
     * @param servicePrincipalName the value for service.service_principal_name
     *
     * @mbg.generated
     */
    public void setServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName == null ? null : servicePrincipalName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.app_id
     *
     * @return the value of service.app_id
     *
     * @mbg.generated
     */
    public Integer getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.app_id
     *
     * @param appId the value for service.app_id
     *
     * @mbg.generated
     */
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.app_name
     *
     * @return the value of service.app_name
     *
     * @mbg.generated
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.app_name
     *
     * @param appName the value for service.app_name
     *
     * @mbg.generated
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.create_time
     *
     * @return the value of service.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.create_time
     *
     * @param createTime the value for service.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.update_time
     *
     * @return the value of service.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.update_time
     *
     * @param updateTime the value for service.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.operator
     *
     * @return the value of service.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.operator
     *
     * @param operator the value for service.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.operator_name
     *
     * @return the value of service.operator_name
     *
     * @mbg.generated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.operator_name
     *
     * @param operatorName the value for service.operator_name
     *
     * @mbg.generated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.approval_status
     *
     * @return the value of service.approval_status
     *
     * @mbg.generated
     */
    public String getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.approval_status
     *
     * @param approvalStatus the value for service.approval_status
     *
     * @mbg.generated
     */
    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus == null ? null : approvalStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.is_alert
     *
     * @return the value of service.is_alert
     *
     * @mbg.generated
     */
    public String getIsAlert() {
        return isAlert;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.is_alert
     *
     * @param isAlert the value for service.is_alert
     *
     * @mbg.generated
     */
    public void setIsAlert(String isAlert) {
        this.isAlert = isAlert == null ? null : isAlert.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column service.status
     *
     * @return the value of service.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column service.status
     *
     * @param status the value for service.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}