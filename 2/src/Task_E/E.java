package Task_E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class E {
    static int numberOfFolders;
    static List<Integer> amountOfDiplomsInFolder = new ArrayList<>();
    static int timeOfFinding = 0;

    public static void main(String[] args) {
        readLines();
        countMinimumTimeComplexity();
        outputResult();
    }

    public static void readLines() {
        Scanner scanner = new Scanner(System.in);
        numberOfFolders = scanner.nextInt();
        int count = numberOfFolders;

        while (count != 0) {
            amountOfDiplomsInFolder.add(scanner.nextInt());
            count--;
        }
    }

    public static void countMinimumTimeComplexity() {
        Collections.sort(amountOfDiplomsInFolder);
        int count = 0;
        while (count != numberOfFolders - 1) {
            timeOfFinding += amountOfDiplomsInFolder.get(count);
            count++;
        }
    }

    public static void outputResult() {
        System.out.println(timeOfFinding);
    }
}
