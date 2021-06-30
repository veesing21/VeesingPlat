package com.veesing.customer.domain;

import java.io.Serializable;
import java.util.Date;


public class CustomerDO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    private String customerNo;

    private String companyName;

    private String contactName;

    private Long telephone;

    private Integer customerType;

    private Long parentId;

    private String parentName;

    private String address;

    private Integer status;

    private Integer isUsed;

    private String logo;

    private String license;

    private Date createTime;

    private Date modifyTime;

    private Date identifyTime;

    private Object customerProducts;

    private Object accountBalance;

    private Object costPackage;

    private Long roleIds;

    private String initUserName;

    private String initPassWord;

    private Long createUserId;

    private String initUser;

    private String appId;

    private String appKey;

    private String reason;

    private String remark;

    private String cusRemark;

    private Long customerServiceId;

    private String intention;

    private Integer category;

    private Long cid;

    private String userphone;

    private Integer customerLevel;

    private Integer needExamine;

    private Integer lowerExamineNum;

    private Integer higherExamineNum;

    private Integer needWhite;

    private Integer needCollectWhite;

    private Integer lowWhiteNum;

    private Integer resendWhiteNum;

    private Integer needShield;

    private Integer ipCheck;

    private String ipList;

    private Long identifyUserId;

    private String name;

    private String extraConfig;

    private Long industryId;

    public Long getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Long industryId) {
        this.industryId = industryId;
    }


    public Integer getNeedShield() {
        return needShield;
    }

    public void setNeedShield(Integer needShield) {
        this.needShield = needShield;
    }

    public Integer getNeedCollectWhite() {
        return needCollectWhite;
    }

    public void setNeedCollectWhite(Integer needCollectWhite) {
        this.needCollectWhite = needCollectWhite;
    }

    public Integer getLowWhiteNum() {
        return lowWhiteNum;
    }

    public void setLowWhiteNum(Integer lowWhiteNum) {
        this.lowWhiteNum = lowWhiteNum;
    }

    public Integer getResendWhiteNum() {
        return resendWhiteNum;
    }

    public void setResendWhiteNum(Integer resendWhiteNum) {
        this.resendWhiteNum = resendWhiteNum;
    }

    public Integer getNeedWhite() {
        return needWhite;
    }

    public void setNeedWhite(Integer needWhite) {
        this.needWhite = needWhite;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getIntention() {
        return intention;
    }

    public void setIntention(String intention) {
        this.intention = intention;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Object getCustomerProducts() {
        return customerProducts;
    }

    public void setCustomerProducts(Object customerProducts) {
        this.customerProducts = customerProducts;
    }

    public Object getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Object accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Object getCostPackage() {
        return costPackage;
    }

    public void setCostPackage(Object costPackage) {
        this.costPackage = costPackage;
    }

    public Long getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(Long roleIds) {
        this.roleIds = roleIds;
    }

    public String getInitUserName() {
        return initUserName;
    }

    public void setInitUserName(String initUserName) {
        this.initUserName = initUserName;
    }

    public String getInitPassWord() {
        return initPassWord;
    }

    public void setInitPassWord(String initPassWord) {
        this.initPassWord = initPassWord;
    }

    public String getInitUser() {
        return initUser;
    }

    public void setInitUser(String initUser) {
        this.initUser = initUser;
    }


    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    public Long getCustomerServiceId() {
        return customerServiceId;
    }

    public void setCustomerServiceId(Long customerServiceId) {
        this.customerServiceId = customerServiceId;
    }

    public Integer getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(Integer customerLevel) {
        this.customerLevel = customerLevel;
    }

    public Integer getNeedExamine() {
        return needExamine;
    }

    public void setNeedExamine(Integer needExamine) {
        this.needExamine = needExamine;
    }

    public Integer getLowerExamineNum() {
        return lowerExamineNum;
    }

    public void setLowerExamineNum(Integer lowerExamineNum) {
        this.lowerExamineNum = lowerExamineNum;
    }

    public Integer getHigherExamineNum() {
        return higherExamineNum;
    }

    public void setHigherExamineNum(Integer higherExamineNum) {
        this.higherExamineNum = higherExamineNum;
    }

    public Date getIdentifyTime() {
        return identifyTime;
    }

    public void setIdentifyTime(Date identifyTime) {
        this.identifyTime = identifyTime;
    }

    public Integer getIpCheck() {
        return ipCheck;
    }

    public void setIpCheck(Integer ipCheck) {
        this.ipCheck = ipCheck;
    }

    public String getIpList() {
        return ipList;
    }

    public void setIpList(String ipList) {
        this.ipList = ipList;
    }

    public Long getIdentifyUserId() {
        return identifyUserId;
    }

    public void setIdentifyUserId(Long identifyUserId) {
        this.identifyUserId = identifyUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCusRemark() {
        return cusRemark;
    }

    public void setCusRemark(String cusRemark) {
        this.cusRemark = cusRemark;
    }

    public String getExtraConfig() {
        return extraConfig;
    }

    public void setExtraConfig(String extraConfig) {
        this.extraConfig = extraConfig;
    }

    @Override
    public String toString() {
        return "CustomerDO{" +
                "id=" + id +
                ", customerNo='" + customerNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", telephone=" + telephone +
                ", customerType=" + customerType +
                ", parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", isUsed=" + isUsed +
                ", logo='" + logo + '\'' +
                ", license='" + license + '\'' +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", identifyTime=" + identifyTime +
                ", customerProducts=" + customerProducts +
                ", accountBalance=" + accountBalance +
                ", costPackage=" + costPackage +
                ", roleIds=" + roleIds +
                ", initUserName='" + initUserName + '\'' +
                ", initPassWord='" + initPassWord + '\'' +
                ", createUserId=" + createUserId +
                ", initUser='" + initUser + '\'' +
                ", appId='" + appId + '\'' +
                ", appKey='" + appKey + '\'' +
                ", reason='" + reason + '\'' +
                ", remark='" + remark + '\'' +
                ", cusRemark='" + cusRemark + '\'' +
                ", customerServiceId=" + customerServiceId +
                ", intention='" + intention + '\'' +
                ", category=" + category +
                ", cid=" + cid +
                ", userphone='" + userphone + '\'' +
                ", customerLevel=" + customerLevel +
                ", needExamine=" + needExamine +
                ", lowerExamineNum=" + lowerExamineNum +
                ", higherExamineNum=" + higherExamineNum +
                ", needWhite=" + needWhite +
                ", needCollectWhite=" + needCollectWhite +
                ", lowWhiteNum=" + lowWhiteNum +
                ", resendWhiteNum=" + resendWhiteNum +
                ", needShield=" + needShield +
                ", ipCheck=" + ipCheck +
                ", ipList='" + ipList + '\'' +
                ", identifyUserId=" + identifyUserId +
                ", name='" + name + '\'' +
                ", extraConfig='" + extraConfig + '\'' +
                ", industryId=" + industryId +
                '}';
    }
}
