package Basics;

import java.util.Scanner;

public class GetAcsii {
    public static void main(String[] args) 
    {
      
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A character:");

        char ch=input.next().charAt(0);  
        int ascii=(int)ch;//converted into int using casting
        System.out.println("Ascii:"+ascii);    }
    
}
