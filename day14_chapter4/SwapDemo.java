package day14_chapter4;

class SwapDemo {
    // create a program to swap two numbers.
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a; // temp now holds the value of a (5)
        a = b;        // a now holds the value of b (10)
        b = temp;     // b now holds the value of temp (5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
    
}
