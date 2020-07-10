package com.company.TruuTuong;

public class Meo extends ConVat {
    private int tuoi;

    public Meo(int tuoi, String name) {
        this.tuoi = tuoi;
        this.name = name;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    void keuu() {
        System.out.println("Meo meo");
    }

    @Override
    void diChuyen() {
        System.out.println("4 chân");
    }
}
