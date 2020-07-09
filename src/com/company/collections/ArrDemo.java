package com.company.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ArrDemo {
    public static void main(String[] args) {
        ArrayList<Integer> daySo = new ArrayList<Integer>();
        Integer tong = 0;
        daySo.add(5);
        daySo.add(4);
        daySo.add(3);
        daySo.add(2);
        daySo.add(1);
        for (int i = 0; i < daySo.size(); i++) {
            System.out.println(daySo.get(i) + " ");
            tong += daySo.get(i);
        }

        daySo.add(2, 100);
        for (int i = 0; i < daySo.size(); i++) {
            System.out.println(daySo.get(i) + " ");
        }

        daySo.set(3, 200);
        for (int i = 0; i < daySo.size(); i++) {
            System.out.println(daySo.get(i) + " ");
        }
        Collections.sort(daySo);
        System.out.println(daySo);
        System.out.println("Tổng: " + tong);
        System.out.println("\n" + daySo.size());
    }
}
