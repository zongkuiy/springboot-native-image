package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzScheulerState extends QrtzScheulerStateKey implements Serializable {
    private Long lastCheckinTime;

    private Long checkinInterval;

    private static final long serialVersionUID = 1L;

    public Long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(Long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    public Long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(Long checkinInterval) {
        this.checkinInterval = checkinInterval;
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
        QrtzScheulerState other = (QrtzScheulerState) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getInstanceName() == null ? other.getInstanceName() == null : this.getInstanceName().equals(other.getInstanceName()))
            && (this.getLastCheckinTime() == null ? other.getLastCheckinTime() == null : this.getLastCheckinTime().equals(other.getLastCheckinTime()))
            && (this.getCheckinInterval() == null ? other.getCheckinInterval() == null : this.getCheckinInterval().equals(other.getCheckinInterval()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        result = prime * result + ((getLastCheckinTime() == null) ? 0 : getLastCheckinTime().hashCode());
        result = prime * result + ((getCheckinInterval() == null) ? 0 : getCheckinInterval().hashCode());
        return result;
    }
}