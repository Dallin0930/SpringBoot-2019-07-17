package com.tw.apistackbase.beans;


import javax.persistence.*;

@Entity
public class Case {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @Column(length = 255,nullable = false)
    private String caseName;
    @Column(nullable = false)
    private long caseTime;

    public Case()
    {

    }

    public Case(String caseName, long caseTime) {
        this.caseName = caseName;
        this.caseTime = caseTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public void setCaseTime(long caseTime) {
        this.caseTime = caseTime;
    }

    public String getId() {
        return id;
    }

    public String getCaseName() {
        return caseName;
    }

    public long getCaseTime() {
        return caseTime;
    }
}
