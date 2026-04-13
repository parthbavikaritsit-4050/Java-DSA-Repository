package Basics.Patterns;

import java.util.Scanner;

public class Square {

        public static void main(String[] args) {
            
            Scanner input=new Scanner(System.in);
            System.out.print("Enter the number of rows:");         
            int n=input.nextInt();

            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    
}
