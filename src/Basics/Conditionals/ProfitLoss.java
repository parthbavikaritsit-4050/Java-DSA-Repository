package Basics.Conditionals;

import java.util.Scanner;

public class ProfitLoss {
public static void main(String[] args) {
    

    Scanner input=new Scanner(System.in);
    System.out.print("Enter Cp:");
    int cp=input.nextInt();
    System.out.print("Enter sp:");
    int sp=input.nextInt();
    
    if(cp>sp)System.out.println("Profit:"+(cp-sp));
    else if(cp==sp)System.err.println("No prit No loss");
    else System.out.println("loss"+(sp-cp));
    
}

}
