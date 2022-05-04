package Task_A;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();
        int interact = scanner.nextInt();
        int checker = scanner.nextInt();
        System.out.println(interactor(code,interact,checker));
    }

    public static int interactor(int code, int interact, int checker) {
        if (interact == 0) {
            return code != 0 ? 3 : checker;
        } else if (interact == 1) {
            return checker;
        } else if (interact == 4) {
            return code != 0 ? 3 : 4;
        } else if (interact == 6) {
            return 0;
        } else if (interact == 7) {
            return 1;
        } else {
            return interact;
        }
    }
}
