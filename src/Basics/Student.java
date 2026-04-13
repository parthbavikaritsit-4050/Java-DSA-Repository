package Basics;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    double marks;

    void percentage(){
    double percent =( marks/200.0)*100;
        System.out.println(percent);
        System.out.println();
    }
     void getData(Scanner input) {
        System.out.print("Enter name: ");
        name = input.nextLine();

        System.out.print("Enter id: ");
        id = input.nextInt();

        System.out.print("Enter marks: ");
        marks = input.nextInt();
        input.nextLine(); }
    
        void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("---------------------");}
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Student []arr=new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            arr[i] = new Student();
            arr[i].getData(input);
        }

        // Display data
        System.out.println("\nStudent Details:");
        for (int i = 0; i < 5; i++) {
            arr[i].display();
        }

        input.close();
    }



       
        
        
        
    
}