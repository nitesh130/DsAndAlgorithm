package com.nitesh.study.theory.sequences;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class StaticArrayTest {

    private static StaticArray staticArray;
    private static int[] arr;

    @BeforeAll
    public static void setUp() {
        staticArray = new StaticArray(10);
        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Test
    @DisplayName("Test method build")
    public void testBuild() {
        staticArray.build(arr);
        assert staticArray.get_at(0) == 0;
    }

    @Test
    @DisplayName("Test method len")
    public void testLen() {
        assert staticArray.len() == 10;
    }

    @Test
    @DisplayName("Test method get_at")
    public void testGetAt() {
        assert staticArray.get_at(2) == 2;
    }

    @Test
    @DisplayName("Test method iterate")
    public void testIterate(){
        staticArray.iterate();
    }

    @Test
    @DisplayName("Test method set_at")
    public void testSetAt() {
        staticArray.set_at(2, 8);
        assert staticArray.get_at(2) == 8;
    }

    @Test
    @DisplayName("Test method get_first")
    public void testGetFirst() {
        int result = staticArray.get_first();
        assert result == 0;
    }

    @Test
    @DisplayName("Test method set_first")
    public void testSetFirst() {
        staticArray.set_first(15);
        assert staticArray.get_first() == 15;
    }

    @Test
    @DisplayName("Test method get_first")
    public void testGetLast() {
        int result = staticArray.get_last();
        assert result == 9;
    }

    @Test
    @DisplayName("Test method set_first")
    public void testSetLast() {
        staticArray.set_last(12);
        assert staticArray.get_last() == 12;
    }



}
