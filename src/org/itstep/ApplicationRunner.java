package org.itstep;

import org.itstep.model.Circle;
import org.itstep.model.Shape;
import org.itstep.model.Square;
import org.itstep.model.Triangle;
import org.itstep.service.ListService;

import javax.print.attribute.SetOfIntegerSyntax;
import java.util.*;

public class ApplicationRunner {
    public static void main(String[] args) {

        Circle circle = new Circle(10);

        Triangle triangle = new Triangle(10, 8);

        Square square = new Square(25);

        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(circle);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(circle);

        Shape maxShape = ListService.getMaxShape(shapeList);

        System.out.println("Max shape is "  + maxShape.getClass().getSimpleName() +
                " and has area " + maxShape.getArea());

    }

}
