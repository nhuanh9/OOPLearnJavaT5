package com.company.classAndObject;

public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    public static void main(String[] args) {
        Circle c3 = new Circle(7);
        System.out.println("Diện tích c3: " + c3.getArea());
        System.out.println("Chu vi c3: " + c3.getPerimeter());

        Circle c4 = new Circle();
        c4.setRadius(5);
        System.out.println("Đường kính c3: " + c4.radius);

    }
}
