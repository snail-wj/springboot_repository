package com.wj.springboot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

/**
 * @author WJ
 * @date 2018/05/23
 */
@Controller
public class PersonProperties {

    @Value("${com.springboot.person.name}")
    private String name;
    @Value("${com.springboot.person.address}")
    private String address;
    @Value("${com.springboot.person.desc}")
    private String desc;

    @Value("${com.springboot.person.nick}")
    private String nick;
    @Value("${com.springboot.person.age}")
    private Integer age;
    @Value("${com.springboot.person.bigValue}")
    private Long bigValue;
    @Value("${com.springboot.person.test1}")
    private Integer test1;
    @Value("${com.springboot.person.test2}")
    private Integer test2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getBigValue() {
        return bigValue;
    }

    public void setBigValue(Long bigValue) {
        this.bigValue = bigValue;
    }

    public Integer getTest1() {
        return test1;
    }

    public void setTest1(Integer test1) {
        this.test1 = test1;
    }

    public Integer getTest2() {
        return test2;
    }

    public void setTest2(Integer test2) {
        this.test2 = test2;
    }
}
