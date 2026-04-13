package Dsa_Arrays;
import java.util.Scanner;

public class LinearSearch
{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.println("Enter element to search");
       int x=input.nextInt();
        System.out.println("Enter Size of Array:");
       int n=input.nextInt();
       int [] arr=new int[n];

       
   System.out.println("Enter Elements Of array:");
       for(int i=0;i<n;i++)
       {
        arr[i]=input.nextInt();
       }

       boolean flag=false;
       for(int j=0;j<n;j++)
       {
        if(arr[j]==x)
        {
            flag=true;
        }

    }
        if(flag==true){
            System.out.println("Element Found:");
        }
        else{  System.out.println("Not Found:");

        
    




    }
}
}