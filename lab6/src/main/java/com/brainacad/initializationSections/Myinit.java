package com.brainacad.initializationSections;

/**
 * Created by Huamani V.R on 05.11.2016.
 */
public class Myinit {
    private static int[] arr = new int[10];

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    static{
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }


}
