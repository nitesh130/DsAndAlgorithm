package com.nitesh.study.theory.sequences;

public class DynamicArray extends StaticArray {

    DynamicArray(int size) {
        super(size);
    }

    public void build(int arr[]) {
        if (arr.length > size) {
            throw new IllegalStateException("input array size is greater than size of the array");
        }
        super.build(arr);
    }

    private void resize() {
        if (count == size) {
            size = 2 * size;
            int[] temp = new int[size];
            for (int i = 0; i < static_array.length; i++) {
                temp[i] = static_array[i];
            }
            static_array = temp;
        }
    }

    public void insert_at(int position, int value) {
        resize();
        int i = count;
        while (i >= position) {
            static_array[i + 1] = static_array[i];
            i--;
        }
        static_array[i + 1] = value;
        count++;
    }

    public void insert_at_first(int value){
        insert_at(0, value);
    }

    public void insert_at_last(int value){
        insert_at(count, value);
    }

    public int delete_at(int position) {
        int i = position;
        int temp = static_array[i];
        while (i < count-1){
            static_array[i] = static_array[i+1];
            i++;
        }
        static_array[i] = 0;
        count--;
        return temp;
    }

    public int delete_at_first(){
        return delete_at(0);
    }

    public int delete_at_last(){
        return delete_at(count-1);
    }


}
