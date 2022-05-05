package Task_C;

import java.util.Scanner;

public class C {
    static String mainString = "";
    static int numberOfLettersToChange =0;
    public static void main(String[] args){
        readString();
        findNumberOfLettersToChange();
        outputNumberOfLettersToChange();
    }

    public static void readString(){
        Scanner scanner = new Scanner(System.in);
        mainString = scanner.nextLine();
    }

    public static void findNumberOfLettersToChange(){
        if(mainString.length() > 1){
            int left = 0;
            int right = mainString.length() - 1;
            while(left != right && left-1 != right){
                if(mainString.charAt(left) != mainString.charAt(right)){
                    numberOfLettersToChange++;
                }
                left++;
                right--;
            }
        }
    }

    public static void outputNumberOfLettersToChange(){
        System.out.println(numberOfLettersToChange);
    }
}
