package Task_D;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = (int) Math.floor(scanner.nextInt() / 2.0);
        while (num != 0) {
            scanner.nextInt();
            num--;
        }
        System.out.println(scanner.nextInt());
    }
}