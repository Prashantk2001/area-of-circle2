package areaofcircle;



import java.util.Scanner;

public class test5 {

    public static void main(String[] args) {
        Double area,circle,radius;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        radius = sc.nextDouble();
        area = Math.PI*radius*radius;


        circle = 2*Math.PI*radius;
        System.out.println("Area of circle = " + area);
        System.out.println("Area of circumferance = " + circle);




    }
}
