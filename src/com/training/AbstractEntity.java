package com.training;

/**
 * Created by KH389659 on 11/10/2017.
 */
public class AbstractEntity {

    protected String name;

    public AbstractEntity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
