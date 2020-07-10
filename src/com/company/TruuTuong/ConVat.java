package com.company.TruuTuong;

public abstract class ConVat {
    protected String name;
    abstract void keuu();
    abstract void diChuyen();
    void hello(){
        System.out.println("Hello!");
    }

    public ConVat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ConVat() {
    }

}
