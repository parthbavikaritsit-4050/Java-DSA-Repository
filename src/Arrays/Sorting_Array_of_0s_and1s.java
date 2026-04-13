package Dsa_Arrays;
import java.util.Arrays;
public class Sorting_Array_of_0s_and1s {

    public static void sort(int [] arr) {
        int n=arr.length;
        int zeros=0;
        int ones=0;

        for (int i=0;i<n;i++)
        {
            if(arr[i]==0)
            { 
                zeros++; 
            }

            else{
                ones++;
            }
        }
         for(int i=0;i<n;i++)
            {
                if(i< zeros)
                {
                    arr[i]=0;
                }
                else{
                    arr[i]=1;
                }
            }   

            
        }

        
    
    public static void main(String[] args) 
    {
        int [] arr={0,0,1,1,0,0,1,1};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        
    
    }
    
}
