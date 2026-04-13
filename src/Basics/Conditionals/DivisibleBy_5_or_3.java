package Basics.Conditionals;

import java.util.Scanner;

public class DivisibleBy_5_or_3 {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    System.out.println("Enter A number:");
    int num =input.nextInt();
    if(num%5==0 || num%3==0)System.out.println("Divisible by 5 or 3");
    else System.out.println("Not Divisible by 5 or 3");

    
}
}