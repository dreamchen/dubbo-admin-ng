package com.by.dubbo.admin.domain;

import java.util.Date;

public class Alert {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.source_id
     *
     * @mbg.generated
     */
    private Integer sourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.source_name
     *
     * @mbg.generated
     */
    private String sourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.source_type
     *
     * @mbg.generated
     */
    private String sourceType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.principal
     *
     * @mbg.generated
     */
    private String principal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.participator
     *
     * @mbg.generated
     */
    private String participator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.customize
     *
     * @mbg.generated
     */
    private String customize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.operator
     *
     * @mbg.generated
     */
    private String operator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.operator_name
     *
     * @mbg.generated
     */
    private String operatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.alert_type
     *
     * @mbg.generated
     */
    private String alertType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alert.status
     *
     * @mbg.generated
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.id
     *
     * @return the value of alert.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.id
     *
     * @param id the value for alert.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.source_id
     *
     * @return the value of alert.source_id
     *
     * @mbg.generated
     */
    public Integer getSourceId() {
        return sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.source_id
     *
     * @param sourceId the value for alert.source_id
     *
     * @mbg.generated
     */
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.source_name
     *
     * @return the value of alert.source_name
     *
     * @mbg.generated
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.source_name
     *
     * @param sourceName the value for alert.source_name
     *
     * @mbg.generated
     */
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName == null ? null : sourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.source_type
     *
     * @return the value of alert.source_type
     *
     * @mbg.generated
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.source_type
     *
     * @param sourceType the value for alert.source_type
     *
     * @mbg.generated
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.principal
     *
     * @return the value of alert.principal
     *
     * @mbg.generated
     */
    public String getPrincipal() {
        return principal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.principal
     *
     * @param principal the value for alert.principal
     *
     * @mbg.generated
     */
    public void setPrincipal(String principal) {
        this.principal = principal == null ? null : principal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.participator
     *
     * @return the value of alert.participator
     *
     * @mbg.generated
     */
    public String getParticipator() {
        return participator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.participator
     *
     * @param participator the value for alert.participator
     *
     * @mbg.generated
     */
    public void setParticipator(String participator) {
        this.participator = participator == null ? null : participator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.customize
     *
     * @return the value of alert.customize
     *
     * @mbg.generated
     */
    public String getCustomize() {
        return customize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.customize
     *
     * @param customize the value for alert.customize
     *
     * @mbg.generated
     */
    public void setCustomize(String customize) {
        this.customize = customize == null ? null : customize.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.create_time
     *
     * @return the value of alert.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.create_time
     *
     * @param createTime the value for alert.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.update_time
     *
     * @return the value of alert.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.update_time
     *
     * @param updateTime the value for alert.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.operator
     *
     * @return the value of alert.operator
     *
     * @mbg.generated
     */
    public String getOperator() {
        return operator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.operator
     *
     * @param operator the value for alert.operator
     *
     * @mbg.generated
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.operator_name
     *
     * @return the value of alert.operator_name
     *
     * @mbg.generated
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.operator_name
     *
     * @param operatorName the value for alert.operator_name
     *
     * @mbg.generated
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.alert_type
     *
     * @return the value of alert.alert_type
     *
     * @mbg.generated
     */
    public String getAlertType() {
        return alertType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.alert_type
     *
     * @param alertType the value for alert.alert_type
     *
     * @mbg.generated
     */
    public void setAlertType(String alertType) {
        this.alertType = alertType == null ? null : alertType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alert.status
     *
     * @return the value of alert.status
     *
     * @mbg.generated
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alert.status
     *
     * @param status the value for alert.status
     *
     * @mbg.generated
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}