package week4.shape;

import week4.enums.FillType;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference (using PI as parameter): " + calculateCircumference(Math.PI, radius));
        System.out.println("Circumference (using constant PI): " + calculateCircumference(radius));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double radius) {
        return 2 * PI * radius;
    }

    public double calculateCircumference(double radius) {
        double PI = Math.PI;
        return 2 * PI * radius;
    }
}
