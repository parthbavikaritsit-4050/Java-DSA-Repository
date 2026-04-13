package Basics.Conditionals;

import java.util.Scanner;

public class Switchcase {

    public static void main(String[] args) {
        
    


    Scanner input=new Scanner(System.in);
    
    
    int a =input.nextInt();
    char op=input.next().charAt(0);
    int b =input.nextInt();

    //Using if-else ladder:
    /*if (op=="+")System.out.println(a+b);
    else if(op=="-")System.out.println(a-b);
    else if(op=="*")System.out.println(a*b);
    else if(op=="/")System.out.println(a/b);
    else System.out.println("Invalid Operator"); */

    
    
    
    switch(op){
        case '+':System.out.println(a+b);break;
        case '-':System.out.println(a-b);break;
        case '*':System.out.println(a*b);break;
        case '/':System.out.println(a/b);break;
        default:System.out.println("Invalid Operator");
    }
    
    
}
}
