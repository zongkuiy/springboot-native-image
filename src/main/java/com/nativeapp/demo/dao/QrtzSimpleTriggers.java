package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzSimpleTriggers extends QrtzSimpleTriggersKey implements Serializable {
    private Long repeatCount;

    private Long repeatInterval;

    private Long timesTriggered;

    private static final long serialVersionUID = 1L;

    public Long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
    }

    public Long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    public Long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(Long timesTriggered) {
        this.timesTriggered = timesTriggered;
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
        QrtzSimpleTriggers other = (QrtzSimpleTriggers) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getRepeatCount() == null ? other.getRepeatCount() == null : this.getRepeatCount().equals(other.getRepeatCount()))
            && (this.getRepeatInterval() == null ? other.getRepeatInterval() == null : this.getRepeatInterval().equals(other.getRepeatInterval()))
            && (this.getTimesTriggered() == null ? other.getTimesTriggered() == null : this.getTimesTriggered().equals(other.getTimesTriggered()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getRepeatCount() == null) ? 0 : getRepeatCount().hashCode());
        result = prime * result + ((getRepeatInterval() == null) ? 0 : getRepeatInterval().hashCode());
        result = prime * result + ((getTimesTriggered() == null) ? 0 : getTimesTriggered().hashCode());
        return result;
    }
}