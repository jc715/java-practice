package com.jc.dozer.domain;

import lombok.Data;

/**
 * @author JC.
 * @date 2018/9/27.
 */
@Data
public class PropertyVO {
    private String propertyName;

    private String propertyValue;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
}
