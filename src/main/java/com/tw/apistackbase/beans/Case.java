package com.tw.apistackbase.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Case {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private long time;

    public Case()
    {

    }

    public Case(String name, long time) {
        this.name = name;
        this.time = time;
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

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
