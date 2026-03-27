package day14_chapter4.arithmetic_operator;

public class ArithmeticDemo2 {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 5;



        // System.out.println(a + b);
        // System.out.println(a - b);
        // System.out.println(a * b);
        // System.out.println(a / b);
        // System.out.println(a % b);

        // division by zero will throw an ArithmeticException
        // System.out.println(a / 0);

     // where user can input the values and perform the operations
     System.out.println("Enter first number A: ");
       java.util.Scanner sc = new java.util.Scanner(System.in);
       int a = sc.nextInt();
       System.out.println("Enter second number B:");
         int b = sc.nextInt();
            System.out.println("A + B = " + (a + b));
            System.out.println("A - B = " + (a - b));
             System.out.println("A * B = " + (a * b));
              System.out.println("A / B = " + (a / b));
               System.out.println("A % B = " + (a % b));

            // close the scanner to prevent resource leak
               sc.close();
               

    }
    
}
