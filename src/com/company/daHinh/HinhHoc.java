package com.company.daHinh;

public class HinhHoc {
    public void tinhDienTich() {
        System.out.println("Chưa biết hình nào");
    }

    public static void main(String[] args) {
        HinhHoc hinhHoc = new HinhHoc();
        hinhHoc.tinhDienTich(); // Đoạn code này bình thường, sẽ in ra "Chưa biết hình nào"

        // Có lúc hinhHoc đóng vai trò là HinhTron trong một ngữ cảnh nào đó
        hinhHoc = new HinhTron();
        hinhHoc.tinhDienTich(); // Đoạn code này sẽ in ra "Đây là Diện tích Hình tròn"

        // Có lúc hinhHoc đóng vai trò là HinhChuNhat trong một ngữ cảnh nào đó
        hinhHoc = new HinhChuNhat();
        hinhHoc.tinhDienTich(); // Đoạn code này sẽ in ra "Đây là Diện tích Chữ nhật"
    }
}

class HinhTron extends HinhHoc {

    @Override
    public void tinhDienTich() {
        System.out.println("Đây là Diện tích hình Tròn");
    }
}

class HinhChuNhat extends HinhHoc {

    @Override
    public void tinhDienTich() {
        System.out.println("Đây là Diện tích hình Chữ nhật");
    }

}

