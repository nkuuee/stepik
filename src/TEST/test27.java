package TEST;

import java.util.Scanner;

public class test27 {
    public static void main(String[] args) {
        int first = new Scanner(System.in).nextInt();
        int second = new Scanner(System.in).nextInt();
        int proizvedenie = first * second;
        if ((proizvedenie % 2) == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
