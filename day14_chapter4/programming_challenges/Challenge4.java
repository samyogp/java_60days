package day14_chapter4.programming_challenges;

import java.util.Scanner;

// create a program to calculate the area of a triangle 
 // area of a triangle = 1/2*B*H

public class Challenge4 {
    public static void main(String[] args) {
    
      Scanner input = new Scanner(System.in);
      System.out.println("Enter breadth: ");
      int breadth = input.nextInt();
      System.out.println("Enter height: ");
      int height = input.nextInt();
      
      int area = (breadth*height) / 2;

      System.out.println("Area of trangle: " + area);

      input.close();




    }
    
}
