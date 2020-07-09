package com.company.QLSV;

public class SinhVien implements Comparable<SinhVien> {
    private int msv;
    private String hoTen;
    private float diemToan;
    private float diemLy;
    private float diemHoa;
    private float tongDiem;

    public SinhVien(int msv, String hoTen, float diemToan, float diemLy, float diemHoa) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.tongDiem = this.diemToan + this.diemLy + this.diemHoa;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getTongDiem() {
        return tongDiem;
    }

    public void setTongDiem(float tongDiem) {
        this.tongDiem = tongDiem;
    }

    @Override
    public int compareTo(SinhVien o) {
        float tongDiem = o.getTongDiem();
        return (int) (this.tongDiem - tongDiem);
    }
}
