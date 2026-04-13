package Basics.Conditionals;

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        


     Scanner input=new Scanner(System.in);
    System.out.println("Enter A number:");
    int num =input.nextInt();
    if(num<0)System.out.println(-num);
    else System.out.println(num);
   
    
}
}