package Basics.Loops;

public class CountDigits {

    public static void main(String[] args) {
        
        int n=-12345;
        int count=0;
        while(n!=0)
        {
            n=n/10;//removes the last digit of the number
            count++;
        }
        System.out.println("Number of digits in the number is: "+count);
   
   
   
    }
    
}
