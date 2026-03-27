package day14_chapter4.arithmetic_operator;

public class ArithmeticDemo3 {
    public static void main(String[] args) {
        // three numbers and perform the operations
        System.out.println("Enter the first number A: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second number B");
        int b = sc.nextInt();
         System.out.println("Enter the third number C");
        int c = sc.nextInt();

        System.out.println("A + B + C = " + (a + b  + c));
         System.out.println("A - B - C = " + (a - b - c));
          System.out.println("A * B * C = " + (a * b * c));
           System.out.println("A / B / C = " + (a / b / c));
            System.out.println("A + B - C = " + (a + b - c));
                System.out.println("A * B / C = " + (a * b / c));


                // close the scanner to present the resource leak
                sc.close();

    }
    
}
