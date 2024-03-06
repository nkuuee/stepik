package TEST;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        int x = new Scanner(System.in).nextInt();
        int y = new Scanner(System.in).nextInt();
        System.out.println((x + 1) / (y - 1) + (y + 1) / (x - 1));
    }
}
