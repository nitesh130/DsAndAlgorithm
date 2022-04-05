package com.nitesh.study.theory.sequences;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class DynamicArrayTest {

    private DynamicArray dynamicArray;
    private int[] arr;

    @BeforeEach
    public void setUp() {
        dynamicArray = new DynamicArray(10);
        arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        dynamicArray.build(arr);
    }

    @Test
    @DisplayName("Test method build exception")
    public void testBuildExcept() {
        int [] arr2 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> dynamicArray.build(arr2));
        assertEquals("input array size is greater than size of the array", ex.getMessage());
    }

    @Test
    @DisplayName("Test method build success")
    public void testBuildSuccess() {
        assert dynamicArray.get_at(2) == 2;
    }

    @Test
    @DisplayName("Test method insert_at")
    public void testInsertAt() {
        dynamicArray.insert_at(4, 17);
        assert dynamicArray.size == 20;
        assert dynamicArray.get_at(4) == 17;
        assert dynamicArray.get_at(5) == 4;
    }

    @Test
    @DisplayName("Test method delete_at")
    public void testDeleteAt() {
        int result = dynamicArray.delete_at(4);
        assert result == 4;
        assert dynamicArray.get_at(4) == 5;
    }

    @Test
    @DisplayName("Test method insert_at_first")
    public void testInsertAtFirst() {
        dynamicArray.insert_at_first(18);
        assert dynamicArray.get_at(0) == 18;
    }

    @Test
    @DisplayName("Test method delete_at_first")
    public void testDeleteAtFirst() {
        int result = dynamicArray.delete_at_first();
        assert result == 0;
    }

    @Test
    @DisplayName("Test method insert_at_last")
    public void testInsertAtLast() {
        dynamicArray.insert_at_last(19);
        assert dynamicArray.get_at(10) == 19;
    }

    @Test
    @DisplayName("Test method delete_at_last")
    public void testDeleteAtLast() {
        int result = dynamicArray.delete_at_last();
        assert result == 9;
    }
}
