package Dsa_Arrays;
import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args)
    {
       Scanner input=new Scanner(System.in);
       System.out.print("Enter Size of Array:");
       int n=input.nextInt();
       int [] arr=new int[n];
       int mx=Integer.MIN_VALUE;//samllest integer value 
       int sl=0;

       
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
            sl=mx;
            mx=arr[j];
            }

       }
       System.out.println("Largest Element:"+mx);
       System.out.println("SecondLargest Element:\t"+sl);
       
}
}
    

