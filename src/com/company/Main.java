package com.company;

public class Main {

    public static void main(String[] args) {
            int[] array = new int[]{21, -42, 3, 32, -12, 67, -9, 114, -29, -5, 99, 7, 65, 33, 19};

            printArray(array);

            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i - 1] > array[i]) {
                        int tmp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = tmp;
                        isSorted = false;
                    }
                }
                printArray(array);
            }
        }
        private static void printArray(int[] arr) {
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(arr[i]);
            }
            System.out.print("]");
            System.out.println();
        }
    }

