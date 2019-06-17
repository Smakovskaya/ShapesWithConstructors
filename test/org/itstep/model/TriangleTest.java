package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void getArea() {
        Triangle triangle = new Triangle(4.0, 8.0);
        double testData = triangle.getArea();
        Assertions.assertEquals(16, triangle.getArea());
    }
}