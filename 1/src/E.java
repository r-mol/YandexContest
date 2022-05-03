import java.util.Scanner;

public class E {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(pointTriangle(D,x,y));
    }

    public static int pointTriangle(int D,int x,int y){
        if(0 <= x && x <= D){
            if(0 <= y && y <= D-x){
                return 0;
            }
        }

        int disA = x+y;
        int disB = Math.abs(D-x) + y;
        int disC = x+ Math.abs(D-y);

        int min = Math.min(disA,Math.min(disC,disB));

        if(min == disA){
            return 1;
        }
        else if(min == disB){
            return 2;
        }
        else{
             return 3;
        }
    }
}
