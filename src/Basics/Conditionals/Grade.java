package Basics.Conditionals;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in); 

    System.out.println("Enter Marks Ou");
    int grade =input.nextInt();
    

    if(grade>81)System.out.println("Very Good:");
    else if(grade>61)System.out.print("Good");
    else if(grade>41)System.out.print("Avrage");
    else if(grade<=40) System.out.print("Fail");
    
}
}