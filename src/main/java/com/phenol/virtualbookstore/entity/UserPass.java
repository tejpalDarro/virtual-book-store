package com.phenol.virtualbookstore.entity;

import java.util.List;

public class UserPass {
    private String userName;
    private String password;
    private UserRole role;

    public UserPass() {
        super();
    }

    public UserPass(String userName, String password, UserRole role) {
        this.password = password;
        this.userName = userName;
        this.role = role;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserPass [userName=" + userName + ", password=" + password + ", role=" + role + "]";
    }

}
