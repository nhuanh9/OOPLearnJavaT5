package com.company.BTVN4;

import java.util.ArrayList;

public class QLSV implements QuanLy<SinhVien> {
    private ArrayList<SinhVien> dssv;

    public QLSV(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    @Override
    public ArrayList<SinhVien> xemTatCa() {
        return dssv;
    }

    @Override
    public void them(SinhVien sinhVien) {
        dssv.add(sinhVien);
    }

    @Override
    public void sua(String name, SinhVien sinhVien) {
        for (SinhVien sv : dssv
        ) {
            if (sv.getName().equals(name)) {
                dssv.set(dssv.indexOf(sv), sinhVien);
            }
        }
    }

    @Override
    public void xoa(String name) {
        for (SinhVien sv : dssv
        ) {
            if (sv.getName().equals(name)) {
                dssv.remove(sv);
                break;
            }
        }
    }

    @Override
    public SinhVien xem(String name) {
        SinhVien svXem = null;
        for (SinhVien sv : dssv
        ) {
            if (sv.getName().equals(name)) {
                svXem = new SinhVien(sv.getAge(), sv.getName(), sv.getTongDiem());
            }
        }
        return svXem;
    }
}
