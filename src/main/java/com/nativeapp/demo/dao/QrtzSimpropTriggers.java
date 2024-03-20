package com.nativeapp.demo.dao;

import java.io.Serializable;
import java.math.BigDecimal;

public class QrtzSimpropTriggers extends QrtzSimpropTriggersKey implements Serializable {
    private String strProp1;

    private String strProp2;

    private String strProp3;

    private Integer intProp1;

    private Integer intProp2;

    private Long longProp1;

    private Long longProp2;

    private BigDecimal decProp1;

    private BigDecimal decProp2;

    private String boolProp1;

    private String boolProp2;

    private static final long serialVersionUID = 1L;

    public String getStrProp1() {
        return strProp1;
    }

    public void setStrProp1(String strProp1) {
        this.strProp1 = strProp1;
    }

    public String getStrProp2() {
        return strProp2;
    }

    public void setStrProp2(String strProp2) {
        this.strProp2 = strProp2;
    }

    public String getStrProp3() {
        return strProp3;
    }

    public void setStrProp3(String strProp3) {
        this.strProp3 = strProp3;
    }

    public Integer getIntProp1() {
        return intProp1;
    }

    public void setIntProp1(Integer intProp1) {
        this.intProp1 = intProp1;
    }

    public Integer getIntProp2() {
        return intProp2;
    }

    public void setIntProp2(Integer intProp2) {
        this.intProp2 = intProp2;
    }

    public Long getLongProp1() {
        return longProp1;
    }

    public void setLongProp1(Long longProp1) {
        this.longProp1 = longProp1;
    }

    public Long getLongProp2() {
        return longProp2;
    }

    public void setLongProp2(Long longProp2) {
        this.longProp2 = longProp2;
    }

    public BigDecimal getDecProp1() {
        return decProp1;
    }

    public void setDecProp1(BigDecimal decProp1) {
        this.decProp1 = decProp1;
    }

    public BigDecimal getDecProp2() {
        return decProp2;
    }

    public void setDecProp2(BigDecimal decProp2) {
        this.decProp2 = decProp2;
    }

    public String getBoolProp1() {
        return boolProp1;
    }

    public void setBoolProp1(String boolProp1) {
        this.boolProp1 = boolProp1;
    }

    public String getBoolProp2() {
        return boolProp2;
    }

    public void setBoolProp2(String boolProp2) {
        this.boolProp2 = boolProp2;
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
        QrtzSimpropTriggers other = (QrtzSimpropTriggers) that;
        return (this.getSchedName() == null ? other.getSchedName() == null : this.getSchedName().equals(other.getSchedName()))
            && (this.getTriggerName() == null ? other.getTriggerName() == null : this.getTriggerName().equals(other.getTriggerName()))
            && (this.getTriggerGroup() == null ? other.getTriggerGroup() == null : this.getTriggerGroup().equals(other.getTriggerGroup()))
            && (this.getStrProp1() == null ? other.getStrProp1() == null : this.getStrProp1().equals(other.getStrProp1()))
            && (this.getStrProp2() == null ? other.getStrProp2() == null : this.getStrProp2().equals(other.getStrProp2()))
            && (this.getStrProp3() == null ? other.getStrProp3() == null : this.getStrProp3().equals(other.getStrProp3()))
            && (this.getIntProp1() == null ? other.getIntProp1() == null : this.getIntProp1().equals(other.getIntProp1()))
            && (this.getIntProp2() == null ? other.getIntProp2() == null : this.getIntProp2().equals(other.getIntProp2()))
            && (this.getLongProp1() == null ? other.getLongProp1() == null : this.getLongProp1().equals(other.getLongProp1()))
            && (this.getLongProp2() == null ? other.getLongProp2() == null : this.getLongProp2().equals(other.getLongProp2()))
            && (this.getDecProp1() == null ? other.getDecProp1() == null : this.getDecProp1().equals(other.getDecProp1()))
            && (this.getDecProp2() == null ? other.getDecProp2() == null : this.getDecProp2().equals(other.getDecProp2()))
            && (this.getBoolProp1() == null ? other.getBoolProp1() == null : this.getBoolProp1().equals(other.getBoolProp1()))
            && (this.getBoolProp2() == null ? other.getBoolProp2() == null : this.getBoolProp2().equals(other.getBoolProp2()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSchedName() == null) ? 0 : getSchedName().hashCode());
        result = prime * result + ((getTriggerName() == null) ? 0 : getTriggerName().hashCode());
        result = prime * result + ((getTriggerGroup() == null) ? 0 : getTriggerGroup().hashCode());
        result = prime * result + ((getStrProp1() == null) ? 0 : getStrProp1().hashCode());
        result = prime * result + ((getStrProp2() == null) ? 0 : getStrProp2().hashCode());
        result = prime * result + ((getStrProp3() == null) ? 0 : getStrProp3().hashCode());
        result = prime * result + ((getIntProp1() == null) ? 0 : getIntProp1().hashCode());
        result = prime * result + ((getIntProp2() == null) ? 0 : getIntProp2().hashCode());
        result = prime * result + ((getLongProp1() == null) ? 0 : getLongProp1().hashCode());
        result = prime * result + ((getLongProp2() == null) ? 0 : getLongProp2().hashCode());
        result = prime * result + ((getDecProp1() == null) ? 0 : getDecProp1().hashCode());
        result = prime * result + ((getDecProp2() == null) ? 0 : getDecProp2().hashCode());
        result = prime * result + ((getBoolProp1() == null) ? 0 : getBoolProp1().hashCode());
        result = prime * result + ((getBoolProp2() == null) ? 0 : getBoolProp2().hashCode());
        return result;
    }
}