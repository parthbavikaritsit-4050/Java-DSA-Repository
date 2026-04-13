package Dsa_Arrays;
import java.util.Arrays;

public class ReverseArray {


    public static void main(String[] args) {
        
        int [] arr={10,20,30,40,50,60,70,80,90,100,110};
        int swap;
        int j=arr.length-1;
        int k=0;

     /*    for(int i=0;i<arr.length/2;i++)//when we run till length of array it swaps two times giving same array as output
         {
        
            swap=arr[j];
            arr[j]=arr[i];
            arr[i]=swap;
            j=j-1;



          } */  //or
         while(k<=j)
         {
            swap=arr[k];
            arr[k]=arr[j];
            arr[j]=swap;
            k++;
            j--;
         }
          for(int m:arr)
          {
            System.out.println(m);
          }

    
}
}