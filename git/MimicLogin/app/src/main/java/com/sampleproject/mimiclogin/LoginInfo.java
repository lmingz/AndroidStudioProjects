package com.sampleproject.mimiclogin;

import java.io.Serializable;

public class LoginInfo implements Serializable {
    private String userName;
    private String passWord;

    public LoginInfo(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public String getUserName() {
        return userName;
    }
}
