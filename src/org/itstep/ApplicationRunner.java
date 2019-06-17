package org.itstep;

import org.itstep.model.Circle;

public class ApplicationRunner {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println("Circle has radius " + circle.getRadius());
        System.out.println("Circle has area " + circle.getArea());
    }
}
