package Task_D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {
    static int lengthOfBench;
    static List<Integer> positionOfLegs = new ArrayList<>();
    static String answer;
    public static void main(String[] args){
        readLines();
        abandonedLegs();
        outputResult();
    }

    public static void readLines(){
        Scanner scanner = new Scanner(System.in);
        lengthOfBench = scanner.nextInt();
        int count = scanner.nextInt();

        while(count!=0){
            positionOfLegs.add(scanner.nextInt());
            count--;
        }
    }

    public static void abandonedLegs(){
        int middleOfBranch;
        if(lengthOfBench%2!=0){
            middleOfBranch = (int)Math.floor(lengthOfBench/2.0);
            findOneLeg(middleOfBranch);
        }
        else{
            middleOfBranch = lengthOfBench/2;
            findTwoLegs(middleOfBranch);
        }
    }

    public static void findOneLeg(int middleOfBranch){
        if(positionOfLegs.contains(middleOfBranch)){
            answer = String.valueOf(middleOfBranch);
        }else{
            findTwoLegs(middleOfBranch);
        }
    }

    public static void findTwoLegs(int middleOfBranch){
        for(int position: positionOfLegs){
            if(position >= middleOfBranch){
                int pos = positionOfLegs.indexOf(position);
                answer = positionOfLegs.get(pos - 1) + " " +  position;
                break;
            }
        }
    }

    public static void outputResult(){
        System.out.println(answer);
    }
}
