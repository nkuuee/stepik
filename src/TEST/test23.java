package TEST;

import java.util.Scanner;

public class test23 {
    public static void main(String[] args) {
        int grani = new Scanner(System.in).nextInt();
        if (grani == 3 | grani == 4 | grani == 5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
