package com.nitesh.study.theory.sequences;

public class StaticArray {

    private int static_array[];
    private int size;

    StaticArray(int size) {
        this.size = size;
        this.static_array = new int[size];
    }

    public void build(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            this.static_array[i] = arr[i];
        }
    }

    public int len() {
        return this.size;
    }

    public void iterate() {
        for (int data : static_array) {
            System.out.println(data);
        }
    }

    public int get_at(int position) {
        return this.static_array[position];
    }

    public void set_at(int position, int value) {
        this.static_array[position] = value;
    }

    public int get_first() {
        return this.static_array[0];
    }

    public void set_first(int value) {
        this.static_array[0] = value;
    }

    public int get_last() {
        return this.static_array[this.size - 1];
    }

    public void set_last(int value) {
        this.static_array[this.size - 1] = value;
    }

}
