package com.veesing.mms.domain;

import java.io.Serializable;
import java.util.Date;


public class MmsBatchDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String phone;

    private Long numbers;

    private Long wareId;

    private Long customerId;

    private Long channelId;

    private Integer state;

    private Integer sendState;

    private Date sendTime;

    private Date createTime;

    private Date modifyTime;

    private String opnition;

    private String remark;

    private String title;

    private String content;

    private Long threadId;

    private Integer isApi;

    private String companyName;

    private String contactName;

    private Long createUserId;

    private String frameJson;

    private Integer mmsSize;

    private String mmsCode;

    private String extend;

    private Long proId;

    private Date identifyTime;

    private Long identifyUserId;

    private Date jobTime;

    private String shieldJson;

    private String ip;

    private Integer pdType;
    private Integer blackFilter;

    public Integer getPdType() {
        return pdType;
    }

    public void setPdType(Integer pdType) {
        this.pdType = pdType;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getNumbers() {
        return numbers;
    }

    public void setNumbers(Long numbers) {
        this.numbers = numbers;
    }

    public Long getWareId() {
        return wareId;
    }

    public void setWareId(Long wareId) {
        this.wareId = wareId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getSendState() {
        return sendState;
    }

    public void setSendState(Integer sendState) {
        this.sendState = sendState;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
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

    public String getOpnition() {
        return opnition;
    }

    public void setOpnition(String opnition) {
        this.opnition = opnition;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Integer getIsApi() {
        return isApi;
    }

    public void setIsApi(Integer isApi) {
        this.isApi = isApi;
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

    public String getFrameJson() {
        return frameJson;
    }

    public void setFrameJson(String frameJson) {
        this.frameJson = frameJson;
    }

    public Integer getMmsSize() {
        return mmsSize;
    }

    public void setMmsSize(Integer mmsSize) {
        this.mmsSize = mmsSize;
    }

    public String getMmsCode() {
        return mmsCode;
    }

    public void setMmsCode(String mmsCode) {
        this.mmsCode = mmsCode;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public Date getIdentifyTime() {
        return identifyTime;
    }

    public void setIdentifyTime(Date identifyTime) {
        this.identifyTime = identifyTime;
    }

    public Long getIdentifyUserId() {
        return identifyUserId;
    }

    public void setIdentifyUserId(Long identifyUserId) {
        this.identifyUserId = identifyUserId;
    }

    public String getShieldJson() {
        return shieldJson;
    }

    public void setShieldJson(String shieldJson) {
        this.shieldJson = shieldJson;
    }

    public Date getJobTime() {
        return jobTime;
    }

    public void setJobTime(Date jobTime) {
        this.jobTime = jobTime;
    }

    public Integer getBlackFilter() {
        return blackFilter;
    }

    public void setBlackFilter(Integer blackFilter) {
        this.blackFilter = blackFilter;
    }

    @Override
    public String toString() {
        return "MmsBatchDO{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", numbers=" + numbers +
                ", wareId=" + wareId +
                ", customerId=" + customerId +
                ", channelId=" + channelId +
                ", state=" + state +
                ", sendState=" + sendState +
                ", sendTime=" + sendTime +
                ", createTime=" + createTime +
                ", modifyTime=" + modifyTime +
                ", opnition='" + opnition + '\'' +
                ", remark='" + remark + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", threadId=" + threadId +
                ", isApi=" + isApi +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", createUserId=" + createUserId +
                ", frameJson='" + frameJson + '\'' +
                ", mmsSize=" + mmsSize +
                ", mmsCode='" + mmsCode + '\'' +
                ", extend='" + extend + '\'' +
                ", proId=" + proId +
                ", identifyTime=" + identifyTime +
                ", identifyUserId=" + identifyUserId +
                ", jobTime=" + jobTime +
                ", shieldJson='" + shieldJson + '\'' +
                ", ip='" + ip + '\'' +
                ", pdType=" + pdType +
                '}';
    }
}
