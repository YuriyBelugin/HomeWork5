package com.company;

public class Ellipse {
    int smallSemiaxis;
    int bigSemiaxis;

    public Ellipse(int smallSemiaxis, int bigSemiaxis) {
        this.smallSemiaxis = smallSemiaxis;
        this.bigSemiaxis = bigSemiaxis;
    }

    public double areaEllipse(){
        return  smallSemiaxis*bigSemiaxis*Math.PI;
    }

    public double perimeterEllipse(){
        return (Math.PI*smallSemiaxis*bigSemiaxis+(smallSemiaxis-bigSemiaxis))/(smallSemiaxis+bigSemiaxis)*4;
    }

}
