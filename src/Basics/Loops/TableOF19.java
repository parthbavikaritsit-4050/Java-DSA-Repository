package Basics.Loops;

import java.util.Scanner;

public class TableOF19 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number to print its table:");                    
        int n=  input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    
}
