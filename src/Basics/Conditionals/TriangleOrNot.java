package Basics.Conditionals;

import java.util.Scanner;

public class TriangleOrNot {

    public static void main(String[] args) {
        
    
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter Frist Side:");
    int a =input.nextInt();
    
    System.out.println("Enter Second Side:");
    int b =input.nextInt();

     System.out.println("Enter Third Side:");
    int c =input.nextInt();
    
    if(a+b>c && b+c>a && a+c>b){
        System.out.println("The sides form a triangle.");
    } else {
        System.out.println("The sides do not form a triangle.");
    }
}
}