package DynamicArrays;

import java.util.Objects;

public class DynamicArrays<AnyType> {
    int currentSize;
    int capacity;
    AnyType[] arr;

    public DynamicArrays(int capacity) {
        this.capacity = capacity;
        this.currentSize = 0;
        this.arr = (AnyType[]) new Object[this.capacity];

    }

    AnyType get(int index) {
        if (index < 0 || index >= currentSize) {
            throw new IllegalArgumentException("Index out of range");

        }

        return arr[index];

    }

    void set(int index, AnyType data) {
        if (index < 0 || index >= currentSize) {
            throw new IllegalArgumentException("Index out of range");

        }

        arr[index] = data;

    }

    void addLast(AnyType data) {
        if (isFull()) {
            extendArray();

        }

        arr[currentSize] = data;
        currentSize++;

    }

    boolean isFull() {
        return this.currentSize == this.capacity;

    }

    void extendArray() {
        int newCapacity = this.capacity * 2;
        var newArray = (AnyType[]) new Object[newCapacity];
        for (int i = 0; i < currentSize; i++) {
            newArray[i] = arr[i];

        }
//        if (currentSize >= 0) System.arraycopy(arr, 0, newArray, 0, currentSize);
        this.capacity = newCapacity;
        this.arr = newArray;

    }

    void show() {
        System.out.println("Array size is " + this.currentSize);
        System.out.println("Array capacity is " + this.capacity);
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {
        var dynamicArrays = new DynamicArrays<Integer>(10);
        dynamicArrays.addLast(100);
        dynamicArrays.addLast(200);
        dynamicArrays.addLast(300);
        dynamicArrays.addLast(100);
        dynamicArrays.addLast(200);
        dynamicArrays.addLast(300);
        dynamicArrays.addLast(100);
        dynamicArrays.addLast(200);
        dynamicArrays.addLast(300);
        dynamicArrays.addLast(100);
        dynamicArrays.addLast(200);
        dynamicArrays.addLast(300);
        dynamicArrays.show();

    }
}
