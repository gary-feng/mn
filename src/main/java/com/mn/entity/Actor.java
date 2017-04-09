package com.mn.entity;

/**
 * Created by FGJ on 2017/4/9.
 */
public class Actor {
    private Integer id;
    private String name;
    private int age;

    public Actor(Integer id, String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
