package TEST;

import java.util.Scanner;

public class test19 {
    public static void main(String[] args) {
        String m = new Scanner(System.in).nextLine();
        String d = new Scanner(System.in).nextLine();
        int m1 = m.length();
        int d1 = d.length();
        if (m1 > d1) {
            System.out.println("Махатма");
        } else {
            System.out.println("Джавахарлал");
        }
    }
}
