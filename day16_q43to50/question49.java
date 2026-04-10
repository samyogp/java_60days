package day16_q43to50;

// Q49: Print numbers from 1 to n using recursion
public class question49 {
    static void print(int n, int current) {
        if (current > n) return;
        System.out.print(current + " ");
        print(n, current + 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Numbers 1 to " + n + ": ");
        print(n, 1);
    }
}