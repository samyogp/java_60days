package day14_chapter4.shorthand_operator;

import java.util.Scanner;

public class ShorthandDemo1 {
    public static void main(String[] args) {


    //     int a = 5;
    //     Scanner input = new Scanner(System.in);
    //     int x1 = input.nextInt();
    //     a = a + x1;
    //     a += x1; // this is equivalent to a = a + x1;

    //      int x2 = input.nextInt();
    //     a = a + x2;
    //     a += x2; // this is equivalent to a = a + x2;
    //      int x3 = input.nextInt();
    //     a = a + x3;
    //     a += x3; // this is equivalent to a = a + x3;
    //     // print the value of a 

    //    System.out.println("a: " + a);


    //     input.close(); 
    //     
    //     
int a = 5;
Scanner input = new Scanner(System.in);
System.out.println("Enter three numbers to add to a: ");
int x1 = input.nextInt();
System.out.println("Enter the second number: ");
int x2 = input.nextInt();
System.out.println("Enter the third number: ");
int x3 = input.nextInt();

a += x1;
a += x2;
a += x3;

System.out.println("a: " + a);

input.close();

    }
    
}
