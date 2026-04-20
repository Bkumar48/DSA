import java.util.*;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if year is leap year or not
        // System.out.println("Enter a year: ");
        // int year = sc.nextInt();
        // if((year % 4 == 0  && year % 100 != 0) || (year % 400 == 0)){
        //     System.out.println(year + " is a leap year.");
        // } else {
        //     System.out.println(year + " is not a leap year.");
        // }

        // Print a square pattern of stars
        // System.out.println("Enter the number of rows: ");
        // int rows = sc.nextInt();
        // for(int i = 1; i<=rows; i++){
        // for(int j = 1; j<=rows; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Reverse a number
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // int rev = 0;
        // while(n > 0){
        // int lastDigit = n % 10;
        // rev = (rev * 10) + lastDigit;
        // n = n / 10;
        // }
        // System.out.print(rev);

        // Check if entered number is multiple of 10 or not
        // do{
        // System.out.println("Enter the number : ");
        // int num = sc.nextInt();
        // if(num % 10 == 0){
        // break;
        // }
        // System.out.println("Number is not multiple of 10");
        // }while(true);

        // Check if a number is prime or not
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if (num <= 1) {
        //     System.out.println("The number is not prime.");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i * i <= num; i++) {
        //         if (num % i == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime) {
        //         System.out.println("The number is prime.");
        //     } else {
        //         System.out.println("The number is not prime.");
        //     }
        // }

        sc.close();
    }
}
