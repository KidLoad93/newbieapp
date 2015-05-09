package com.newbie.web.entities;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trongbui
 */
public class Student {
    private String id;
    private String name;
    private int age;
    private byte sex;
    private String hometown;

    public Student() {
    }

    public Student(String id, String name, int age, byte sex, String hometown) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hometown = hometown;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
    
    
}
