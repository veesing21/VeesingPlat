package com.veesing.system.domain;

import java.io.Serializable;
import java.util.Date;

public class CopyrightDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String logo;

    private String copyright;

    private String qqConsultation;

    private String operationGuide;

    private String msgCenter;

    private String customerServiceCenter;

    private Long customerId;

    private Date createTime;

    private String interfaceDoc;


    private Long createUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInterfaceDoc() {
        return interfaceDoc;
    }

    public void setInterfaceDoc(String interfaceDoc) {
        this.interfaceDoc = interfaceDoc;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getQqConsultation() {
        return qqConsultation;
    }

    public void setQqConsultation(String qqConsultation) {
        this.qqConsultation = qqConsultation;
    }

    public String getOperationGuide() {
        return operationGuide;
    }

    public void setOperationGuide(String operationGuide) {
        this.operationGuide = operationGuide;
    }

    public String getMsgCenter() {
        return msgCenter;
    }

    public void setMsgCenter(String msgCenter) {
        this.msgCenter = msgCenter;
    }

    public String getCustomerServiceCenter() {
        return customerServiceCenter;
    }

    public void setCustomerServiceCenter(String customerServiceCenter) {
        this.customerServiceCenter = customerServiceCenter;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }


}
