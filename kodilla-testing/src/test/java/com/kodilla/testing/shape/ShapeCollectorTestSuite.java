package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void  afterAllTests() {
        System.out.println("All tests are finished.");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        Shape shape = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        //When
        shapeCollector.addFigure(shape);
        //Than
        Assert.assertEquals(1, shapeCollector.getShapeQuantity());
    }
    @Test
    public void testRemoveFigure() {
        //Given
        Shape shape = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        boolean result = shapeCollector.removeFigure(shape);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.getShapeQuantity());
    }
    @Test
    public void testGetFigure() {
        //Given
        Shape shape = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        Shape result = shapeCollector.getFigure(0);
        //Than
        Assert.assertEquals(shape, result);
    }
    @Test
    public void testShowFigures() {
        //Given
        Shape shape = new Square(2);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(shape);
        //When
        String result = "Shape: Square, field: 4.0";
        //Then
        Assert.assertEquals(result, shapeCollector.showFigures());

    }
}
