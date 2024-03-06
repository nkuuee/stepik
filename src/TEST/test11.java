package TEST;

import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        String sc = new Scanner(System.in).nextLine();
        int sc1 = new Scanner(System.in).nextInt();
        char letter = sc.charAt(sc1-1);
        System.out.println(letter);

    }
}
