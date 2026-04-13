package Dsa_Arrays;

public class Sorting_0s_1s_onepass {


    public static void sort(int [] arr) {
        int j=arr.length-1;
        int i=0;

        while (i<j) {
            if(arr[i]==0){i++;}
            if(arr[j]==1){j--;}
            if(i>j){break;}
            if(arr[i]==1&&arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
            }

            
        }

    }    
    
    public static void main(String[] args) 
    {
        int [] arr={1,0,0,1,1,0};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        
    
    }
    
}
    
