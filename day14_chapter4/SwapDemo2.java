package day14_chapter4;

import java.util.Scanner;

public class SwapDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to swapping station!");
        System.out.println("Please enter the value of A: ");

        int a =  input.nextInt();
        System.out.println("Please enter the value of B: ");
        int b = input.nextInt();
        
        int c = a; // c now holds the value of A
        a = b; // A now holds the value of B
        b = c; // B now holds the value of c ( which is the original value of A)
        System.out.println("Swapping Done!");
        System.out.println(" value of A is: " + a);
        System.out.println("value of B is: " + b);
        
        input.close();
    }
    
}
