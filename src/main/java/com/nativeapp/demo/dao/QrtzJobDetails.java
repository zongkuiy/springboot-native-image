package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzJobDetails extends QrtzJobDetailsKey implements Serializable {
    private String description;

    private String jobClassName;

    private String isDurable;

    private String isNonconcurrent;

    private String isUpdateData;

    private String requestsRecovery;

    private byte[] jobData;

    private static final long serialVersionUID = 1L;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public String getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
    }

    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public String getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        QrtzJobDetails other = (QrtzJobDetails) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobGroup() == null ? other.getJobGroup() == null : this.getJobGroup().equals(other.getJobGroup()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getJobClassName() == null ? other.getJobClassName() == null : this.getJobClassName().equals(other.getJobClassName()))
            && (this.getIsDurable() == null ? other.getIsDurable() == null : this.getIsDurable().equals(other.getIsDurable()))
            && (this.getIsNonconcurrent() == null ? other.getIsNonconcurrent() == null : this.getIsNonconcurrent().equals(other.getIsNonconcurrent()))
            && (this.getIsUpdateData() == null ? other.getIsUpdateData() == null : this.getIsUpdateData().equals(other.getIsUpdateData()))
            && (this.getRequestsRecovery() == null ? other.getRequestsRecovery() == null : this.getRequestsRecovery().equals(other.getRequestsRecovery()))
            && (this.getJobData() == null ? other.getJobData() == null : this.getJobData().equals(other.getJobData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobGroup() == null) ? 0 : getJobGroup().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getJobClassName() == null) ? 0 : getJobClassName().hashCode());
        result = prime * result + ((getIsDurable() == null) ? 0 : getIsDurable().hashCode());
        result = prime * result + ((getIsNonconcurrent() == null) ? 0 : getIsNonconcurrent().hashCode());
        result = prime * result + ((getIsUpdateData() == null) ? 0 : getIsUpdateData().hashCode());
        result = prime * result + ((getRequestsRecovery() == null) ? 0 : getRequestsRecovery().hashCode());
        result = prime * result + ((getJobData() == null) ? 0 : getJobData().hashCode());
        return result;
    }
}