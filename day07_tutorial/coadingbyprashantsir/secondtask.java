package day07_tutorial.coadingbyprashantsir;

import java.util.Scanner;

public class secondtask {
    public static void main(String[] args) {
        System.out.println("please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + "welcome to java program");
        // scanner closed
        input.close();
    }
    
}
