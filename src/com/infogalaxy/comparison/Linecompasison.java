package com.infogalaxy.comparison;

import java.util.Scanner;

public class Linecompasison {
    public static void main(String[] args) {
        System.out.println("welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc =new Scanner(System.in);
        //Cu-1- Calculate Length
        double x1;
        double x2;
        double y1;
        double y2;
        System.out.println("Enter the Y1 and  x1 Co-ordinates :");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the X2 and Y2 Co-ordinates :");
        x2 = sc.nextDouble();
        y2 =sc.nextDouble();
        double lenthoflile = Math.sqrt(Math.pow((x2 -x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Lanth Of Line is : "+lenthoflile);

    }

}
