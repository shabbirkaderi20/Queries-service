package com.queries.queries.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueryDTO {

    private String email;
    private String password;

    @Override
    public String toString() {
        return "queryDTO[email: " +email +", password: " +password +"]";
    }
}
