package com.personalgarage.service.dto;

import com.personalgarage.service.base.dto.BaseDTO;

public class UsersSettingsTypesDTO extends BaseDTO {

    private String value;

    public UsersSettingsTypesDTO() {}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}