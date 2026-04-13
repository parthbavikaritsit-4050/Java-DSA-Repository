package Basics.Loops;
import java.util.Scanner;

public class Composite {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if it is composite:");
        Scanner input=new Scanner(System.in);
        int n=  input.nextInt();
        boolean isComposite = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println(n + " is a composite number.");
        } else {
            System.out.println(n + " is not a composite number.");
        }

    }
    
}
