import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int enter = scanner.nextInt();
        int exit = scanner.nextInt();
        System.out.println(numStations(N, enter, exit));
    }

    public static int numStations(int N, int enter, int exit) {
        int answer;
        int reverseAnswer;

        if (enter < exit) {
            int temp = enter;
            enter = exit;
            exit = temp;
        }

        answer = enter - exit;
        reverseAnswer = N - answer;
        return Math.min(answer, reverseAnswer) - 1;
    }
}
