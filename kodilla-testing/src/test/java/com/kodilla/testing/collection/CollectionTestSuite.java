package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator1 = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        ArrayList result = new ArrayList<>();
        result = exterminator1.exterminate(numbers);
        //than
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i < 12; i++) {
            numbers.add(i);
        }
        //When
        ArrayList<Integer> testList = exterminator2.exterminate(numbers);
        //Than
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 2; i < numbers.size(); i += 2){
            result.add(i);
        }
        Assert.assertEquals(result, testList);

    }
}
