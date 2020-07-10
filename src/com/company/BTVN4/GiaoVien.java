package com.company.BTVN4;

public class GiaoVien extends Person {

    private String monDay;

    public GiaoVien(int age, String name, String monDay) {
        super(age, name);
        this.monDay = monDay;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    @Override
    void dinhDanh() {
        System.out.println("Tôi là giáo viên.");
    }

    @Override
    void cachDiChuyen() {
        System.out.println("Mazda 3");
    }
}
