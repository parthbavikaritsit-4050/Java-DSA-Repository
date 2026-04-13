package Dsa_Arrays;

import java.util.Scanner;

public class MaxValue{
    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter Size of Array:");
       int n=input.nextInt();
       int [] arr=new int[n];
       int mx=Integer.MIN_VALUE;//samllest integer value 

       
   System.out.print("Enter Elements Of array:");
       for(int i=0;i<n;i++)
       {
        arr[i]=input.nextInt();
       }

       for(int j=0;j<n;j++)
       {
       // mx=Math.max(mx,arr[j]);
        //or
        if(arr[j]>mx)

         {
                mx=arr[j];
            }
       }
       System.out.println("Largest Element:"+mx);

}
}