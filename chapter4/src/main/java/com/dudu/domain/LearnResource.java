package com.dudu.domain;

import lombok.Data;
/**
 * Created by tengj on 2017/3/7.
 */
@Data
public class LearnResource {

    private String author;
    private String title;
    private String url;

    public LearnResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }
}
