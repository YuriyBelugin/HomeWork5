package com.company;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(8,7);
        Square square = new Square(9);
        Ellipse ellipse = new Ellipse(3, 8);
        Circle circle = new Circle(10);

        System.out.println("Площадь прямоугольника " + rectangle.area());
        System.out.println("Периметр прямоугольника " + rectangle.perimeter());
        System.out.println("Площадь квадрата " + square.area());
        System.out.println("Периметр квадрата " + square.perimeter());
        System.out.println("Площадь эллипса " + ellipse.areaEllipse());
        System.out.println("Периметр эллипса " + ellipse.perimeterEllipse());
        System.out.println("Площадь окружности " + circle.areaEllipse());
        System.out.println("Периметр окружности " + circle.perimeterEllipse());
    }
}
