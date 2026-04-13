package Dsa_Arrays;
import java.util.Arrays;

 class builtInMethods {
    public static void main(String[] args)
     {
       int []arr={1,2,3,4,5,6,7};
       int []num=arr;//points adress of arr to num both are ponited to single array changes in arr made in num and voice versa
       for(int i:arr)
       {
          System.out.print(" "+i);      
       }
          System.out.println();
          num[0]=10;

    for(int i:arr)
      {
        System.out.print(" "+i);
      }
    int []cpy=Arrays.copyOf(arr, arr.length);
    Arrays.sort(cpy);
    arr[0]=100;
    System.out.println();
    for(int i:cpy)
      {
        System.out.print(" "+i);
      }
     }
    
}
