package Basics.Loops;

import java.util.Scanner;

public class Ap {
public static void main(String[] args) {
    

    Scanner input=new Scanner(System.in);
        System.out.println("Enter n:");                    
        int n=  input.nextInt();
        for(int i=1;i<=2*n-1;i+=2)
        {
            System.out.println(i+" ");
        }
    
}
}