package TEST;

import java.util.Scanner;

public class test21 {
    public static void main(String[] args) {
        int one = new Scanner(System.in).nextInt();
        int two = new Scanner(System.in).nextInt();
        int three = new Scanner(System.in).nextInt();
        int result = Math.max(one, two);
        System.out.println(Math.max(result, three));
    }
}
