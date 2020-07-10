package com.company.BT0907;

import com.company.interfaceDemo.HanhDong;

public class SinhVien extends Person implements HoatDong {
    private float diemSo;

    public SinhVien(String hoTen, int tuoi, float diemSo) {
        this.diemSo = diemSo;
        setHoTen(hoTen);
        setTuoi(tuoi);
    }

    public float getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }

    public void inRa() {
        System.out.println("Sinh viên!");
    }

    @Override
    public String viecLam() {
        return "Hello";
    }
}
