package com.brainacad.genericos;

import java.util.Arrays;

/**
 * Created by Huamani V.R on 27.11.2016.
 */
public class Lab2144 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        String[] strings = new String[]{"One", "Two", "Three"};
        MyMixer<Integer> myMixer = new MyMixer<>(integers);
        MyMixer<String> myMixer1 = new MyMixer<>(strings);

        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(strings));

        Integer[] shufledInts = myMixer.shuffle();
        String[] shuffledStrings = myMixer1.shuffle();

        System.out.println(Arrays.toString(shufledInts));
        System.out.println(Arrays.toString(shuffledStrings));

    }
}
