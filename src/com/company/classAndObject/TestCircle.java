package com.company.classAndObject;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(4);
        System.out.println("Diện tích c1: " + c1.getArea());
        System.out.println("Chu vi c1: " + c1.getPerimeter());

        Circle c2 = new Circle(6);
        System.out.println("Diện tích c2: " + c2.getArea());
        System.out.println("Chu vi c2: " + c2.getPerimeter());
    }
}
