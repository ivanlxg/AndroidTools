package com.juns.wechat.chat.utils;

/**
 * Created by Administrator on 2016/4/11 0011.
 */
public class BasicNameValuePair {
    private String name;
    private String value;

    public BasicNameValuePair(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return  this.value;
    }

    @Override
    public String toString() {
        return "BasicNameValuePair{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
