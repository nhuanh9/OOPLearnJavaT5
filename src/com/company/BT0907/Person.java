package com.company.BT0907;

public class Person {
    private String hoTen;
    private int tuoi;

    public Person() {
    }

    public Person(String hoTen, int tuoi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void inRa() {
        System.out.println("Con Người");
    }
}
