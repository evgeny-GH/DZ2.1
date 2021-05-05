package com.company;

public abstract class Barrier {
    private String name;
    
    public Barrier(String name) {
        this.name = name;
    }
    
    protected abstract boolean moving(Skills skills);
    
    public String getName() {
        return name;
    }
}