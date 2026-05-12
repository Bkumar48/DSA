import java.util.*;

public class arrays {

    public static int linear_search(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 14;

        System.out.println("Index: " + linear_search(numbers, key));

        sc.close();
    }
}
