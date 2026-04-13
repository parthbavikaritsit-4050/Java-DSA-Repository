package Basics;

import java.util.Scanner;

public class AreaofCircle {

    public static void main(String[] args) {
        
    
    Scanner input =new Scanner(System.in);
   System.out.println("Enter Radius:\t");
    double r=input.nextInt();
    double pi=3.14;
    double area=pi*r*r;
    System.out.print(area);
    
}
}