package Basics.Conditionals;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    
    System.out.println("Enter A number:");
    int num =input.nextInt();
    
    System.out.println(num%2==0?"Even":"Odd");    
}

}
    
