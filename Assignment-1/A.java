import java.util.*;
public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
         int n = arr.length;
        Random ans= new Random();
         for (int i = n - 1; i > 0; i--) {
            int j = ans.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
