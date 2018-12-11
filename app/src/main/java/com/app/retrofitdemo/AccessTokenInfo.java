package com.app.retrofitdemo;

public class AccessTokenInfo {

    /**
     * access_token : a09e216b-38cc-4b61-9e8e-549fbf0ccfb3
     * expires_in : 604800000
     * scope : music_play
     */

    private String access_token;
    private int expires_in;
    private String scope;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
