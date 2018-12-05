package com.dudu.domain;

import lombok.Data;

/**
 * Created by tengj on 2017/3/29.
 */
@Data
public class User {
    private String userName;
    private String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

}
