package org.itstep.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    void getArea() {
        Square square = new Square(10);
        double testData = square.getArea();
        Assertions.assertEquals(100, square.getArea());
    }
}