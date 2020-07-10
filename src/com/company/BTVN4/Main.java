package com.company.BTVN4;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<GiaoVien> dsgv = new ArrayList<>();
        dsgv.add(new GiaoVien(20, "Louis", "Tin"));
        QLGV qlgv = new QLGV(dsgv);
        for (GiaoVien gv : qlgv.xemTatCa()
        ) {
            System.out.println(gv.getName() + ", " + gv.getAge() + ", " + gv.getMonDay());
        }
        Scanner sc = new Scanner(System.in);

        //Tìm
        System.out.println("Nhập vào tên cần tìm: ");
        String nameFind = sc.nextLine();
        GiaoVien giaoVienCanTim = qlgv.xem(nameFind);
        System.out.println(giaoVienCanTim.getName() + ", " + giaoVienCanTim.getAge() + ", " + giaoVienCanTim.getMonDay());

        //Thêm
        System.out.println("Nhập tên:");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi:");
        int age = sc.nextInt();
        System.out.println("Nhập môn dậy:");
        sc.nextLine();
        String monDay = sc.nextLine();

        qlgv.them(new GiaoVien(age, name, monDay));
        for (GiaoVien gv : qlgv.xemTatCa()
        ) {
            System.out.println(gv.getName() + ", " + gv.getAge() + ", " + gv.getMonDay());
        }

    }
}
