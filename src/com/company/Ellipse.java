package com.company;

public class Ellipse {
    int small;
    int big;
    int radius;

    public Ellipse(int small, int big) {
        this.small = small;
        this.big = big;
    }

    public Ellipse(int radius) {
        this.radius = radius;
    }

    public double areaEllipse(){
        return  small*big*Math.PI;
    }

    public double perimeterEllipse(){
        return (Math.PI*small*big+(small-big))/(small+big)*4;
    }

    public double areaCircle(){
        return Math.PI*(radius*radius);
    }

    public double perimeterCircle(){
        return 2*Math.PI*radius;
    }
}
