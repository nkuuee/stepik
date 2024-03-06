package TEST;

import java.util.Scanner;

public class test25 {
    public static void main(String[] args) {
        System.out.println("Рискни ввести число:");
        double number = new Scanner(System.in).nextDouble();
        if (number % 7 == 0 && number % 5 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
