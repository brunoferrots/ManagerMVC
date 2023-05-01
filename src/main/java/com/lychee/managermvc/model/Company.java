package com.lychee.managermvc.model;

import java.util.Date;

public class Company {
    private String name;
    private Integer id;
    private Date dateOpened = new Date();

    public Company(String name, Date date) {
        this.name = name;
        this.dateOpened = date;
    }

    public Company(String name, Date date, Integer id) {
        this.name = name;
        this.dateOpened = date;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOpened(Date dateOpened) {
        this.dateOpened = dateOpened;
    }

    public String getName() {
        return this.name;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }
    public Date getDateOpened() {
        return this.dateOpened;
    }
}
