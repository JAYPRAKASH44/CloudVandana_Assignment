import java.util.*;
public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         if (s == null || s.length() == 0){
        System.out.println("Roman numeral " + s + " is equivalent to integer -1"  );
        return ;
         }
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = map.get(currentChar);
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
            
                result += currentValue;
            }
            prevValue = currentValue;
        }
         System.out.println("Roman numeral " + s + " is equivalent to integer " + result);
    }
}
