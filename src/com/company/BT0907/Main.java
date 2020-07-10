package com.company.BT0907;

public class Main{
    public static void main(String[] args) {
        Person p1 = new Person("NAL", 19);
        System.out.println(p1.getHoTen());
        SinhVien sv1 = new SinhVien("DNA", 20, (float) 3.5);
        System.out.println(sv1.getHoTen() + " " + sv1.getDiemSo());
        sv1.inRa();
    }
}
