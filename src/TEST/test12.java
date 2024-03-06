package TEST;

import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        String one = new Scanner(System.in).nextLine();
        String two = new Scanner(System.in).nextLine();
        String full = one + " " + two;
        System.out.println(full);
        System.out.println(full.length());
    }
}
