package Dsa_Arrays.Imps;
import java.util.*;

public class Merge_Sorted_Arryas {
    public static void main(String[] args) {
        int []a={11,33,42,71};
        int [] b={26,54,69,82};
        int [] c=new int[b.length+a.length];
        int i=0;
        int k=0;
        int l=0;
        while (i<a.length && k<b.length)
    {
        if(a[i]<=b[k])
        {
            c[l]=a[i];
            i++;l++;
        }
        else{
            c[l]=b[k];
            l++;k++;
        }
        if (i==a.length) {
            while(k<b.length)
            {
                c[l]=b[k];
                k++;l++;
            }
        
        if (k==b.length) {
            while(i<a.length)
            {
                c[l]=a[i];
                l++;i++;
            }
            

        }
    }  
    
        }
        for (int j: c) {
            System.out.println(j);
            
        }
    
    
}
}