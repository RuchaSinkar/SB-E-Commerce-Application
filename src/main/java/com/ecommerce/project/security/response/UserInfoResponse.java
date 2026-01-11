package com.ecommerce.project.security.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserInfoResponse {
    private Long id;
    @Setter
    @Getter
    private String jwtToken;
    @Setter
    @Getter
    private String username;
    @Getter
    @Setter
    private List<String> roles;

    public UserInfoResponse(Long id,String jwtToken, String username, List<String> roles) {
        this.id = id;
        this.jwtToken = jwtToken;
        this.username = username;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
