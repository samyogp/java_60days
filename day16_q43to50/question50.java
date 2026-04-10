package day16_q43to50;

public class question50 {
    static void print(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Numbers " + n + " to 1: ");
        print(n);
    }
}