package TEST;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        String a = new Scanner(System.in).nextLine();
        int number = a.length()-1;
        char first = a.charAt(0);
        char last = a.charAt(number);
        System.out.println(first);
        System.out.println(last);

    }
}
