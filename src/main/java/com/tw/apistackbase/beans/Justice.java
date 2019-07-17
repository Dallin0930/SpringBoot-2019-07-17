package com.tw.apistackbase.beans;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Justice {

    @Id
    @GeneratedValue
    private String id;

    @Column(nullable = false,length = 255)
    private String justiceName;

    public void setId(String id) {
        this.id = id;
    }

    public void setJusticeName(String justiceName) {
        this.justiceName = justiceName;
    }

    public String getId() {
        return id;
    }

    public Justice(String justiceName) {
        this.justiceName = justiceName;
    }
}
