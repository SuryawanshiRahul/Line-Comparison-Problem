package com.infogalaxy.comparison;

import java.util.Scanner;

public class Linecompasison {
    public static void  equals(double lenthofline1,double lenofline2 ){
        if (lenthofline1 == lenofline2){
            System.out.println("Both Lines are Same.");
        }else {
            System.out.println("Lines are Not Same.");
        }
    }
    public static void main(String[] args) {
        System.out.println("welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc =new Scanner(System.in);
        //Cu-1- Calculate Length
        double x1;
        double x2;
        double y1;
        double y2;
        //UC-2 Length of Line 2 Calculated
        double a1;
        double a2;
        double b1;
        double b2;
        System.out.println("Enter the Y1 and  x1 Co-ordinates :");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the X2 and Y2 Co-ordinates :");
        x2 = sc.nextDouble();
        y2 =sc.nextDouble();
        double lenthofline1 = Math.sqrt(Math.pow((x2 -x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Lanth Of Line is : "+lenthofline1);

        System.out.println("Enter the a1 and  b1 Co-ordinates :");
        a1 = sc.nextDouble();
        b1 = sc.nextDouble();
        System.out.println("Enter the Y1 and  x1 Co-ordinates :");
        a2 = sc.nextDouble();
        b2 = sc.nextDouble();
        double lenthofline2 = Math.sqrt(Math.pow((a2 -a1),2) + Math.pow((b2 - b1),2));
        System.out.println("Lanth Of Line is : "+lenthofline2);
        equals(lenthofline1,lenthofline2);

    }
}
