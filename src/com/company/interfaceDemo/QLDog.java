package com.company.interfaceDemo;

public class QLDog implements HanhDong{
    @Override
    public void them() {
        System.out.println("Thêm thành công!");
    }

    @Override
    public void sua() {
        System.out.println("Sửa thành công!");

    }

    @Override
    public void xoa() {
        System.out.println("Đã xoá!");
    }

    @Override
    public void xem(int i) {
        System.out.println("Hello!");
    }


}
