package com.company.BTVN4;

public class SinhVien extends Person {
    private float tongDiem;

    public SinhVien(int age, String name, float tongDiem) {
        super(age, name);
        this.tongDiem = tongDiem;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    @Override
    void dinhDanh() {
        System.out.println("Em là sinh viên.");
    }

    @Override
    void cachDiChuyen() {
        System.out.println("Đi xe bus.");
    }
}
