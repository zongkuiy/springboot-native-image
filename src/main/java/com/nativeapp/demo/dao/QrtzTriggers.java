package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzTriggers extends QrtzTriggersKey implements Serializable {
    private String jobName;

    private String jobGroup;

    private String description;

    private Long nextFireTime;

    private Long prevFireTime;

    private Integer priority;

    private String triggerState;

    private String triggerType;

    private Long startTime;

    private Long endTime;

    private String calendarName;

    private Short misfireInstr;

    private byte[] jobData;

    private static final long serialVersionUID = 1L;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Long getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public Short getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
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
        QrtzTriggers other = (QrtzTriggers) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobGroup() == null ? other.getJobGroup() == null : this.getJobGroup().equals(other.getJobGroup()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getNextFireTime() == null ? other.getNextFireTime() == null : this.getNextFireTime().equals(other.getNextFireTime()))
            && (this.getPrevFireTime() == null ? other.getPrevFireTime() == null : this.getPrevFireTime().equals(other.getPrevFireTime()))
            && (this.getPriority() == null ? other.getPriority() == null : this.getPriority().equals(other.getPriority()))
            && (this.getTriggerState() == null ? other.getTriggerState() == null : this.getTriggerState().equals(other.getTriggerState()))
            && (this.getTriggerType() == null ? other.getTriggerType() == null : this.getTriggerType().equals(other.getTriggerType()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCalendarName() == null ? other.getCalendarName() == null : this.getCalendarName().equals(other.getCalendarName()))
            && (this.getMisfireInstr() == null ? other.getMisfireInstr() == null : this.getMisfireInstr().equals(other.getMisfireInstr()))
            && (this.getJobData() == null ? other.getJobData() == null : this.getJobData().equals(other.getJobData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobGroup() == null) ? 0 : getJobGroup().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getNextFireTime() == null) ? 0 : getNextFireTime().hashCode());
        result = prime * result + ((getPrevFireTime() == null) ? 0 : getPrevFireTime().hashCode());
        result = prime * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
        result = prime * result + ((getTriggerState() == null) ? 0 : getTriggerState().hashCode());
        result = prime * result + ((getTriggerType() == null) ? 0 : getTriggerType().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCalendarName() == null) ? 0 : getCalendarName().hashCode());
        result = prime * result + ((getMisfireInstr() == null) ? 0 : getMisfireInstr().hashCode());
        result = prime * result + ((getJobData() == null) ? 0 : getJobData().hashCode());
        return result;
    }
}