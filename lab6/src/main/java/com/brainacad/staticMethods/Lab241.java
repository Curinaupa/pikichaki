package com.brainacad.staticMethods;

/**
 * Lab246
 * Create class MyMath with two static methods (findMin and findMax), which will take array
 * of int values  as argument and return minimum element value (for findMin method) or  maximum element
 * value (for findMax method).
 * Add to class MyMath final static field PI = 3.14 and static method areaOfCircle,
 * which will take radius, use constant PI and calculate area
 */
class MyMath {
    public static final double PI = 3.1415;

    public static double areaOfCircle(double radius) {

        return PI * Math.pow(radius, 2);
    }

    public static int findMax(int[] arr) {
        int max;
        if (!(arr == null || arr.length == 0)) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];

                }
            }
        } else {
            max = Integer.MAX_VALUE;
            System.out.println("Array is empty or null");
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min;
        if ((arr == null || arr.length == 0)) {
            min = Integer.MIN_VALUE;
            System.out.println("Array is empty or null");
        } else {

            min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        return min;
    }
}


public class Lab241 {
    public static void main(String[] args) {


        int[] matrix = {5, 6, 7, -2, 7, 8, 1, 9, 0};
        int[] matrix2 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        int[] arr = {5, 6, -11, 2};
//        int maximum = MyMath.findMax(matrix);
//        System.out.println("Maximum : " +  maximum);
//        int maximum1 = MyMath.findMax(matrix2);
//        System.out.println("Maximum : " +  maximum1);
//        int minimum = MyMath.findMin(matrix);
//        System.out.println("Minimum: " + minimum);
//        int minimum1 = MyMath.findMin(matrix2);
//        System.out.println("Minimum: " + minimum1);
//        System.out.println();
//        System.out.println("Maximum :" + MyMath.findMax(arr));
//        System.out.println("Minimum :" + MyMath.findMin(arr));
//        arr = new int[]{-100_0};
//        System.out.println("Maximum :" + MyMath.findMax(arr));
//        System.out.println("Minimum :" + MyMath.findMin(arr));
        arr = new int[]{};
        System.out.println("Maximum :" + MyMath.findMax(arr));
        System.out.println("Minimum :" + MyMath.findMin(arr));
        System.out.println("Area of circle is: " + MyMath.areaOfCircle(10));
    }
}

