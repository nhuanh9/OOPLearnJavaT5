package com.company.QLSV;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon = 0;
        ArrayList<SinhVien> dssv = new ArrayList<SinhVien>();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1: Xem DSSV.");
            System.out.println("2: Thêm SV.");
            System.out.println("3: Xoá SV.");
            System.out.println("4: Sửa SV.");
            System.out.println("5: Tìm theo MSV.");
            System.out.println("6: Thoát.");
            System.out.println("Chọn ");
            chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    if (dssv.size() == 0) {
                        System.out.println("Danh sách trống.");
                    } else {
                        for (SinhVien sv : dssv) {
                            System.out.println("Tên: " + sv.getHoTen() + ", " + sv.getTongDiem());
                        }
                    }

                    break;
                case 2:
                    System.out.println("Nhập thông tin sinh viên:");
                    int msv = scanner.nextInt();
                    scanner.nextLine();
                    String hoTen = scanner.nextLine();
                    float diemToan = scanner.nextFloat();
                    float diemLy = scanner.nextFloat();
                    float diemHoa = scanner.nextFloat();
                    SinhVien sv = new SinhVien(msv, hoTen, diemToan, diemLy, diemHoa);
                    dssv.add(sv);
                    System.out.println("Thêm thành công!");
                    break;
                case 3:
                    System.out.println("Nhập msv cần xoá!");
                    int msvXoa = scanner.nextInt();
                    int flag = 0;
                    for (SinhVien sinhvien : dssv
                    ) {
                        if (sinhvien.getMsv() == msvXoa) {
                            dssv.remove(sinhvien);
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Sinh viên không tồn tại.");
                    } else {
                        System.out.println("Xoá thành công.");
                    }
                    break;
                case 4:
                    System.out.println("Nhập msv cần sửa!");
                    int msvSua = scanner.nextInt();
                    int flagSua = 0;
                    for (SinhVien sinhvien : dssv
                    ) {
                        if (sinhvien.getMsv() == msvSua) {
                            System.out.println("Nhập thông tin sinh viên:");
                            scanner.nextLine();
                            String hoTenSua = scanner.nextLine();
                            float diemToanSua = scanner.nextFloat();
                            float diemLySua = scanner.nextFloat();
                            float diemHoaSua = scanner.nextFloat();
                            SinhVien svSua = new SinhVien(msvSua, hoTenSua, diemToanSua, diemLySua, diemHoaSua);
                            dssv.set(dssv.indexOf(sinhvien), svSua);
                            flagSua = 1;
                        }
                    }
                    if (flagSua == 0) {
                        System.out.println("Sinh viên không tồn tại.");
                    } else {
                        System.out.println("Sửa thành công.");
                    }
                    break;
                case 5:
                    System.out.println("Nhập msv cần sửa!");
                    int msvTim = scanner.nextInt();
                    int flagTim = 0;
                    for (SinhVien sinhvien : dssv
                    ) {
                        if (sinhvien.getMsv() == msvTim) {
                            System.out.println("Tên: " + sinhvien.getHoTen() + ", " + sinhvien.getTongDiem());
                            flagTim = 1;
                        }
                    }
                    if (flagTim == 0) {
                        System.out.println("Sinh viên không tồn tại.");
                    }
                    break;
                case 6:
                    break;
            }
        } while (chon != 6);


    }
}
