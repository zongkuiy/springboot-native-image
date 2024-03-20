package com.nativeapp.demo.dao;

import java.io.Serializable;

public class QrtzCalendars extends QrtzCalendarsKey implements Serializable {
    private byte[] calendar;

    private static final long serialVersionUID = 1L;

    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
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
        QrtzCalendars other = (QrtzCalendars) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getCalendarName() == null ? other.getCalendarName() == null : this.getCalendarName().equals(other.getCalendarName()))
            && (this.getCalendar() == null ? other.getCalendar() == null : this.getCalendar().equals(other.getCalendar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getCalendarName() == null) ? 0 : getCalendarName().hashCode());
        result = prime * result + ((getCalendar() == null) ? 0 : getCalendar().hashCode());
        return result;
    }
}