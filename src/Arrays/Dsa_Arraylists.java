package Dsa_Arrays;

import java.util.*;

public class Dsa_Arraylists {

    public static void main(String[] args)
      {
        ArrayList<Integer> arr=new ArrayList<>(6);
        arr.add(0,10);
         arr.add(1,20);
          arr.add(2,110);
           arr.add(40);
            arr.add(50);
            System.out.println(arr +"Size:"+ arr.size());
            arr.remove(1);
            System.out.println(arr +"Size:"+ arr.size()+"Removed Index 1 element");

            System.out.println(arr.get(1)); 

            arr.set(3, 1000);
            System.out.println(arr +"Size:"+ arr.size()+" "+"Modified index 3");


             

    }
}