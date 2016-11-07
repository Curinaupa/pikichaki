package com.brainacad.staticMethods;

/**Write a program that computes the distance an object will fall in Earth's gravity.
 Create a new class called GravityCalculator with method calcDist(double t) that takes double  t,
 and returns the the position of an object after falling for t seconds (outputting the position in meters).
 The formula in Math notation is:
 x(t) = 0.5 × at 2 + vit + xi
 Where:
 a - Acceleration (m/s 2 ) =-9.81
 t - Time (s) (for example t=10)
 vi Initial velocity (m/s) =0
 xi Initial position =0
 Declare Acceleration value field as a constant;

 * Created by Huamani V.R on 07.11.2016.
 */
class GravityCalculator{
    private final double ACCELARATION = -9.81;
    //private double TIME = 10;
    private double vInitial;
    private double xInitial;

    public GravityCalculator(double vInitial, double xInitial) {
        this.vInitial = vInitial;
        this.xInitial = xInitial;
    }

    public double getvInitial() {
        return vInitial;
    }

    public void setvInitial(double vInitial) {
        this.vInitial = vInitial;
    }

    public double getxInitial() {
        return xInitial;
    }

    public void setxInitial(double xInitial) {
        this.xInitial = xInitial;
    }

    public double calcDist(double t){
        return 0.5*ACCELARATION*Math.pow(t,2) + getvInitial()*t+ getxInitial();
    }
    public void getDistance(double time){
        System.out.println("Distance to Object: " + calcDist(time));
    }
}
public class Lab247 {
    public static void main(String[] args) {
        new GravityCalculator(0, 0).getDistance(100);
    }

}
