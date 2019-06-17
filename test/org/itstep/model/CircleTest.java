package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void getArea() {
        Circle circle = new Circle(10);
        double testData = circle.getArea();
        Assertions.assertEquals(314.15926, testData, 0.0001);
    }
}