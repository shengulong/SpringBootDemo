package com.dudu.Controller;

import com.dudu.domain.ConfigBean;
import com.dudu.domain.ConfigTestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * Created by tengj on 2017/2/27.
 */
@RestController
public class UserController {

    @Value("${com.dudu.name}")
    private  String name;
    @Value("${com.dudu.want}")
    private  String want;

    // @Resource默认是按照名称装配的
    @Resource
    ConfigBean configBean;

    // @Autowired是默认按照类型装配的
    @Autowired
    ConfigTestBean configTestBean;

    @Value("${com.dudu.yearhope}")
    private String yearhope;


    @RequestMapping("/")
    public String hello(){
        return name+","+want;
        // return configBean.getName()+configBean.getWant();
        //return yearhope;
        // return configBean.getName()+configBean.getWant();
    }

    @RequestMapping("/test1")
    public String test1(){
        // return name+","+want;
        return "test1:" + configBean.getName() + configBean.getWant();
        //return yearhope;
        // return configBean.getName()+configBean.getWant();
    }

    @RequestMapping("/test2")
    public String test2(){
        // return name+","+want;
        // return "test:" + configBean.getName() + configBean.getWant();
        //return yearhope;
        return "test2:" + configTestBean.getName() + configTestBean.getWant();
    }

    @RequestMapping("/yearHope")
    public String year() {
        return yearhope;
    }
}
