package com.tw.apistackbase.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Procuratorate {

    @Id
    @GeneratedValue
    private String id;

    @Column(length = 50,unique = true)
    private String procuratorateName;

    public Procuratorate() {

    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public Procuratorate(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }
}
