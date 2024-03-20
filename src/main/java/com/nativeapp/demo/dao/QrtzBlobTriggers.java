package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzBlobTriggers extends QrtzBlobTriggersKey implements Serializable {
    private byte[] blobData;

    private static final long serialVersionUID = 1L;

    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
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
        QrtzBlobTriggers other = (QrtzBlobTriggers) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getBlobData() == null ? other.getBlobData() == null : this.getBlobData().equals(other.getBlobData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getBlobData() == null) ? 0 : getBlobData().hashCode());
        return result;
    }
}