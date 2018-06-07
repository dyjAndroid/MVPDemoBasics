package com.dyj.mvpdemobasics.data;

/**
 * Created by dyj
 * on 2018/6/7.
 */
public class IdentityInfoBean {

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public IdentityInfoBean(String name, int age, String sex) {

        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
