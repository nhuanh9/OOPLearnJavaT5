package com.company.arr;

import java.util.Scanner;

public class ThemPhanThu {
    public static void main(String args[]) {
        int array[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao gia tri cua X:");
        int X = scanner.nextInt();
        System.out.println("Nhap vao vi tri muon them X vao:");
        int index = scanner.nextInt();
        array = insertElement(array, X, index);
        printArray(array);
    }

    private static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static int[] insertElement(int oldArray[],
                                       int element, int index) {
        int length = oldArray.length;
        int newArray[] = new int[length + 1];
        System.arraycopy(oldArray, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(oldArray, index, newArray, index
                + 1, length - index);
        return newArray;
    }
}
