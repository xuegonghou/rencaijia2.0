package com.crm.Test.login;

/**
 * Created by Administrator on 2017/6/29.
 */
class User {
    private String Id;
    private String username;
    private String password;


    public User( String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}