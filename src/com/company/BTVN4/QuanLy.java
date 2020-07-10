package com.company.BTVN4;

import java.util.ArrayList;

public interface QuanLy<Object> {
    ArrayList<Object> xemTatCa();

    void them(Object o);

    void sua(String name, Object o);

    void xoa(String name);

    Object xem(String name);
}
