package Task_C;

import java.util.Scanner;

public class C {
    public static void main(String[] args){
        Scanner scanner  =  new Scanner(System.in);
        int dm = scanner.nextInt();
        int md = scanner.nextInt();
        int year = scanner.nextInt();
        System.out.println(checker(dm,md,year));
    }

    public static int checker (int dm,int md,int year) {
        if(year >= 1970 && year <= 2069) {
            if ((dm > 12 && md <= 12) ||(dm <= 12 && md > 12) || dm == md) {
                return 1;
            }
        }
        return 0;
    }
}
