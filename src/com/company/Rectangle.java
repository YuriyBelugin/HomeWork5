package com.company;

public class Rectangle {
    int a1;
    int a2;

    public Rectangle(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public int area() {
        return a1*a2;
    }

    public int perimeter(){
        return (a1+a2)*2;
    }

}

