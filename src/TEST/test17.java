package TEST;

import java.util.Scanner;

public class test17 {
    public static void main(String[] args) {
        int number = new Scanner(System.in).nextInt();
        int number1 = new Scanner(System.in).nextInt();
        int result = number + number1;
        int result1 = number - number1;
        System.out.println("Сложение: " + number + " + " + number1 + " = " + result +
                "\n" + "Вычитание: " + number + " - " + number1 + " = " + result1);
    }
}
