package com.funnyland.funnyland_server.model.user.dto;

import lombok.Data;

@Data
public class UserSignupDTO {
    private String username;
    private String password;
    private String name;
    private String email;
}