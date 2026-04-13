package Dsa_Arrays.Imps;
import java.util.*;
public class SortingColors {
    public static void swap(int [] arr,int mid,int low)
    {
        int temp=arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;

    }


    public static void main(String[] args) {

        int arr[]={1,2,1,0,1,2,0,0,1,1};
        int n=arr.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr, mid, low);
                low++;//should be all zeros befroe low
                mid++;
            }
            else if(arr[mid]==1)
            {
                mid++ ;
            }
            else{//if arr[mid]==
            swap(arr,mid,high);
                high-- ;//should be all twos after high

            }
        }
        
         for (int ele : arr) {
            System.out.print(ele);
        }
        
        
    }
    

}
