package TEST;

import java.util.Scanner;

public class test20 {
    public static void main(String[] args) {
        int passwordBD = new Scanner(System.in).nextInt();
        int passwordUser = new Scanner(System.in).nextInt();
        if (passwordBD == passwordUser) {
            System.out.println("Access is granted");
        } else {
            System.out.println("Access is denied");
        }
    }
}
