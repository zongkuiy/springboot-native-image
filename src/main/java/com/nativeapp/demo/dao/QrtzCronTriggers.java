package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzCronTriggers extends QrtzCronTriggersKey implements Serializable {
    private String cronExpression;

    private String timeZoneId;

    private static final long serialVersionUID = 1L;

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
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
        QrtzCronTriggers other = (QrtzCronTriggers) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getCronExpression() == null ? other.getCronExpression() == null : this.getCronExpression().equals(other.getCronExpression()))
            && (this.getTimeZoneId() == null ? other.getTimeZoneId() == null : this.getTimeZoneId().equals(other.getTimeZoneId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        result = prime * result + ((getTimeZoneId() == null) ? 0 : getTimeZoneId().hashCode());
        return result;
    }
}