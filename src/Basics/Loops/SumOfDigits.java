package Basics.Loops;

public class SumOfDigits {

    public static void main(String[] args) {
        
        int n=1234;
        int sum=0;
        while(n>0)
        {
            int rem=n%10;//gives the last digit of the number
            sum+=rem;
            n/=10;
        }
        System.out.println("Sum of digits is: "+sum);
   
   
   
    }
    
}
