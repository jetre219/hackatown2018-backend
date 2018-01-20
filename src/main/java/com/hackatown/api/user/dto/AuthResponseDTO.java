package com.hackatown.api.user.dto;

public class AuthResponseDTO {

    private String accessToken;
    private String expiresIn;
    private String signedRequest;
    private String userID;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getExpiresIn() {
        return this.expiresIn;
    }

    public String getSignedRequest(){
        return this.signedRequest;
    }

    public String getUserID() {
        return this.userID;
    }

}
