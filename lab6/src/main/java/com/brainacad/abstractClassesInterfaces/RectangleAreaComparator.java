package com.brainacad.abstractClassesInterfaces;

import java.util.Comparator;

/**
 * Created by Huamani V.R on 15.11.2016.
 */
public class RectangleAreaComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.calcArea() < o2.calcArea()){
            return  -1;
        }
        if (o1.calcArea() > o2.calcArea()) {
            return 1;
        }
        return 0;
    }
}
