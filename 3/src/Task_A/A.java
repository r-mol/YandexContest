package Task_A;

import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        String[] line = scanner.nextLine().split(" ");
        Set<String> set = new HashSet<>(Arrays.asList(line));
        line = scanner.nextLine().split(" ");

        for(String str : line){
            if(set.contains(str)){
                count++;
            }
        }
        System.out.println( count);
    }
}
