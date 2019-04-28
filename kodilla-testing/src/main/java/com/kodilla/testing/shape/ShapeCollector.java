package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> shapes = new ArrayList<>();
    private String showFiguresResult;

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = shapes.get(n);
        return shape;
    }

    public String showFigures() {
        for(int i = 0; i < shapes.size(); i++){
            Shape shape = shapes.get(i);
            showFiguresResult = "Shape: " + shape.getShapeName() + ", field: " + shape.getField();
        }
        return showFiguresResult;
    }

    public int getShapeQuantity() {
        return shapes.size();
    }


}
