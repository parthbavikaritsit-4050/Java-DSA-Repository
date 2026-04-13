package Dsa_Arrays;

public class TwoSum {

   public static void main(String[] args) {
    
   
    int [] arr={7,9,2,0,2};
    int x=9;
    System.out.println("The index of Elements Having Sum 9:");
    for(int i=0;i<=arr.length;i++)
    {
        for( int j=i+1;j<arr.length;j++)
        {
            if(arr[i]+arr[j]==9)   { 
            System.out.println(i+" "+j);}
            
        }
    }
    
}
}
