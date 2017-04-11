package com.mn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by FGJ on 2017/4/9.
 */
@Entity
public class Actor {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

//    @Column
    private String name;

//    @Column
    private int age;

    protected Actor () {

    }

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
