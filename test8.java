package areaofcircle;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Double area,radius,circle;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        area= 3.1412*radius*radius;
        circle =2*3.1412*radius;
        System.out.println("Area of circle = " + area);
        System.out.println("Circumferance of circle = " + circle);
    }
}
