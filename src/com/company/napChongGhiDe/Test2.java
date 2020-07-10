package com.company.napChongGhiDe;

public class Test2 {
    public static void main(String[] args) {
        A1 a = new A1();
        a.p(10);
        a.p(10.0);
    }
}

class A1 extends B1 {
    public void p(int number) {
        System.out.println(number);
    }
}

class B1 {
    public void p(double number) {
        System.out.println(number * 2);
    }
}
