package areaofcircle;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Double area, circle, radius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius = sc.nextDouble();
        area = 3.1412 *radius*radius;
        circle = 3 * 3.1412 * radius;
        System.out.println("Area of the circle = " + area);
        System.out.println("circumferance of circle = " + circle);

    }
}
