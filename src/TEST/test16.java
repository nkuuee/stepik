package TEST;

import java.util.Scanner;

public class test16 {
    public static void main(String[] args) {
        int year = new Scanner(System.in).nextInt();
        int result = ((year / 4) - (year / 100) + (year / 400));
        System.out.println(result);

    }
}
