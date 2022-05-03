import java.util.*;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int number = scanner.nextInt();

        while(number != 0){

            if(!map.containsKey(number)){
                map.put(number,1);
            }else{
                map.put(number,map.get(number)+1);
            }

            number = scanner.nextInt();
        }

        int max  = Collections.max(map.keySet());
        System.out.println(map.get(max));
    }
}
