package com.ebube.dailyAlgorithms;


//Write a function that returns true if a given point (x,y) is inside
// of a unit circle (that is, a "normal" circle with a radius of one) centered at
// the origin (0,0) and returns false if the point is outside.
//
//Input
//x: The first coordinate of the given point.
//y: The second coordinate of the given point.
//Notes
//The region bounded by the circle is considered to be an open disk,
// so points on the boundary of the circle should return false.
//We are using the euclidean metric.

import static java.lang.Math.sqrt;

//squareroot of xsquare and ysquare if its less than 1==true, if greater or equal to 1 false
public class PointInAUnitCircle {
    public static void main(String[] args) {
        System.out.println(pointInCircle(0.5,0.5));
    }
    public static boolean pointInCircle(double x, double y) {
        double ans = 0;
        double result = 0;
        ans = Math.pow(x,2) + Math.pow(y,2);
        result = Math.sqrt(ans);
        if( result < 1) return true;
        if( result >= 1) return false;
        return false;
    }
}
