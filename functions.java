import java.util.*;

public class functions {

    // function to find the average of three numbers

    // public static float average(int a, int b, int c) {
    //     float avg = (a + b + c) / 3.0f;
    //     return avg;
    // }

    // function to check even or odd

    // public static boolean isEven(int n) {
    //     return n % 2 == 0 ? true : false;
    // }

    // function to check palindrome number

    // public static boolean isPalindromeNumber(int n) {
    //     int original = n;
    //     int reverse = 0;
    //     while (n > 0){
    //         reverse = reverse * 10 + n % 10;
    //         n /= 10;
    //     }
    //     return original == reverse;
    // }

    // function to sum the digits of a number
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter three numbers:");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float result = average(a, b, c);
        // System.out.println("The average is: " + result);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        // System.out.println("Is the " + n + " number even? " + isEven(n));
        // System.out.println("Is the " + n + " number a palindrome? " + isPalindromeNumber(n));
        System.out.println("The sum of digits in " + n + " is: " + sumDigits(n));
        sc.close();
    }
}
