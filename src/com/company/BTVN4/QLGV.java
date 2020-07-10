package com.company.BTVN4;

import java.util.ArrayList;

public class QLGV implements QuanLy<GiaoVien> {
    private ArrayList<GiaoVien> dsgv;

    public QLGV(ArrayList<GiaoVien> dsgv) {
        this.dsgv = dsgv;
    }

    public ArrayList<GiaoVien> getDsgv() {
        return dsgv;
    }

    public void setDsgv(ArrayList<GiaoVien> dsgv) {
        this.dsgv = dsgv;
    }

    @Override
    public ArrayList<GiaoVien> xemTatCa() {
        return dsgv;
    }

    @Override
    public void them(GiaoVien o) {
        dsgv.add(o);
    }

    @Override
    public void sua(String name, GiaoVien o) {
        for (GiaoVien giaoVien : dsgv
        ) {
            if (giaoVien.getName().equals(name)) {
                dsgv.set(dsgv.indexOf(giaoVien), o);
            }
        }
    }

    @Override
    public void xoa(String name) {
        for (GiaoVien giaoVien : dsgv
        ) {
            if (giaoVien.getName().equals(name)) {
                dsgv.remove(giaoVien);
                break;
            }
        }
    }

    @Override
    public GiaoVien xem(String name) {
        GiaoVien giaoVienXem = null;
        for (GiaoVien giaoVien : dsgv
        ) {
            if (giaoVien.getName().equals(name)) {
                giaoVienXem = new GiaoVien(giaoVien.getAge(), giaoVien.getName(), giaoVien.getMonDay());
            }
        }
        return giaoVienXem;
    }
}
