package Basics;

public class TypeCasting {
    public static void main(String[] args) 
    {
      ///Implicit
        System.out.println("Implicit Casting"); 
        int a=2;
        System.out.println("a:"+a);
        double m=a;
        System.out.println("j:"+m);

        //Explicit 

        System.out.println("Explicit Casting");
        double k=2.5;
        System.out.println("k:"+k);
       // int j=k;not valid 
       int j=(int)k;
       System.out.println("k:"+j);

    }
    
}
