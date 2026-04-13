package Basics.Conditionals;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        
    

    Scanner input=new Scanner(System.in);
    System.out.println("Enter A number 1:");
    int num1 =input.nextInt();

    System.out.println("Enter A number 2:");
    int num2 =input.nextInt();
    
    System.out.println("Enter A number 3:");
    int num3 =input.nextInt();
    
    

    if(num1>num2 &&num1>num3)System.out.println("Greatest:"+num1);
    else if(num2>num3)System.out.print("Greatest:"+num2);
    else System.out.print("Greatest:"+num3);

    
}

}