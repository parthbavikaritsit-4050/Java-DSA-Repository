package Dsa_Arrays;

public class Rotate {

    
    public static void reverse(int[] arr, int i, int j) {
        while (i <=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {110,20,30,40,50,60,70};
        int n=arr.length;
        int k=3;
        k=k%n;// bcoz in raotaion resut of k==9 and k==1 i same for n==4

        
        reverse(arr, 0, n-k-1);//rotate till frist part
        reverse(arr, n-k,n-1);//second part
        reverse(arr, 0, n-1);//at last whole array

        for (int m : arr) {
            System.out.println(m);
        }
    }

        }
