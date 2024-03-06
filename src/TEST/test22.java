package TEST;

import java.util.Scanner;

public class test22 {
    public static void main(String[] args) {
        int macca = new Scanner(System.in).nextInt();
        int normativ = new Scanner(System.in).nextInt();
        if (macca <= normativ) {
            System.out.println("Бой продолжается!");
        } else {
            System.out.println("Холифилд - чемпион!");
        }
    }
}
