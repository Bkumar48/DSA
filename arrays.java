import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // find max
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
        sc.close();
    }
}
