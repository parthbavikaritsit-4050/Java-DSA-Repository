package Basics.Patterns;
import java.util.Scanner;


public class AlphaNumericTriangle {


    public static void main(String[] args) {
        // write your code logic here

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        short n=input.nextShort();

        for(int i=n;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if (i%2==0) System.out.print((char)((64+j))+" ");
         
                else System.out.print(j+" ");
                   }
            System.out.println();
        }

        
    }
}
    
