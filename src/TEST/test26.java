package TEST;

import java.util.Scanner;

public class test26 {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();
        String letter = new Scanner(System.in).next();
        int number = line.length();
        int findletter = line.indexOf(letter);
        if (number > 20 || findletter != -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
