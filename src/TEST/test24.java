package TEST;

import java.util.Scanner;

public class test24 {
    public static void main(String[] args) {
        double number = new Scanner(System.in).nextDouble();
        if (number % 7 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
