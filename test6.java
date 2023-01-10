package areaofcircle;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        double area,circle,radius;
        Scanner sc =  new Scanner(System.in);
        radius = sc.nextDouble();
        area = 3.1412*radius*radius;
        circle = 2*3.1412*radius;
        System.out.println("Area of cicle = " + area);
        System.out.println("circumferance of circle = " + circle);

    }
}
