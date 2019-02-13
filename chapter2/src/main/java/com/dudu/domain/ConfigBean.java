package com.dudu.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by tengj on 2017/2/27.
 */
// 通过@ConfigurationProperties加载properties文件内的配置，通过prefix属性指定properties的配置的前缀，通过locations指定properties文件的位置

@EnableConfigurationProperties
@lombok.Data
@ConfigurationProperties(prefix = "com.dudu")
public class ConfigBean {
    private String name;
    private String want;

}
