import java.util.*;

public class basics {

    // *********** Functions ************
    // public static void calculateSum(int a, int b) { // Parameters
    // int sum = a + b;
    // System.out.println("The sum is: " + sum);
    // }

    // Factorial of a number
    // public static int factorial(int n){
    // int factorial = 1;
    // for (int i =1; i<=n; i++) {
    // factorial *= i;
    // }
    // return factorial;
    // }

    // Binomial Coefficient nCr = n! / (r! * (n-r)!)
    // public static int binomialCoefficient(int n, int r){
    // int numerator = factorial(n);
    // int denominator = factorial(r) * factorial(n - r);
    // return numerator / denominator;
    // }

    // Check if a number is prime or not
    // public static boolean isPrime(int n){
    // // Corner cases
    // if (n <= 2) return true;

    // for(int i=2; i*i<= n; i++){
    // if(n % i == 0){
    // return false;
    // }
    // }
    // return true;
    // }

    // // Print all prime numbers in a range
    // public static void PrimesinRange (int n){
    // for(int i = 2; i<=n; i++){
    // if(isPrime(i)){
    // System.out.print(i + " ");
    // }
    // }
    // }

    // Function overloading using data types
    // public static void sum(int a, int b) {
    //     System.out.println("The sum is: " + (a + b));
    // }

    // public static void sum(float a, float b) {
    //     System.out.println("The sum is: " + (a + b));
    // }

    // function for binary to decimal
    public static void binaryToDecimal(int n) {
        int decimal = 0;
        int power = 0;

        while(n > 0){
            int lastDigit = n % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            n = n / 10;
        }
        System.out.println("Decimal equivalent: " + decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Check if year is leap year or not
        // System.out.println("Enter a year: ");
        // int year = sc.nextInt();
        // if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        // System.out.println(year + " is a leap year.");
        // } else {
        // System.out.println(year + " is not a leap year.");
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
        // System.out.println("The number is not prime.");
        // } else {
        // boolean isPrime = true;
        // for (int i = 2; i * i <= num; i++) {
        // if (num % i == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime) {
        // System.out.println("The number is prime.");
        // } else {
        // System.out.println("The number is not prime.");
        // }
        // }

        // Print the sum of even an odd numbers
        // System.out.println("Enter the size of the array: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("Enter the element at index " + i + ": ");
        // arr[i] = sc.nextInt();
        // }
        // int evenSum = 0;
        // int oddSum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] % 2 == 0) {
        // evenSum += arr[i];
        // } else {
        // oddSum += arr[i];
        // }
        // }
        // System.out.println("Sum of even numbers: " + evenSum);
        // System.out.println("Sum of odd numbers: " + oddSum);

        // Calculate the factorial of a number
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // int factorial = 1;
        // for (int i =1; i<=num; i++) {
        // factorial *= i;
        // }
        // System.out.println("Factorial of " + num + " is: " + factorial);

        // Print the multiplication table of a number
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // System.out.println(num + " x " + i + " = " + (num * i));
        // }

        // right angle triangle pattern
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for(int i = 1; i<=num; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // inverted right angle triangle pattern
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for(int i = num; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print("*" + " ");
        // }
        // System.out.println();
        // }

        // number pattern half pyramid
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for(int i = 1; i<=num; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // character pattern half pyramid
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // char ch = 'A';
        // for(int i = 1; i<=num; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(ch + " ");
        // ch++;
        // }
        // System.out.println();
        // }

        // inverted number pattern half pyramid
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for(int i = num; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // Floyd's triangle pattern
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // int counter = 1;
        // for(int i = 1; i<=num; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();
        // }

        // 0-1 pattern half pyramid
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // for(int i = 1; i<=num; i++){
        // for(int j=1; j<=i; j++){
        // if((i + j) % 2 == 0){
        // System.out.print("1" + " ");
        // } else {
        // System.out.print("0" + " ");
        // }
        // }
        // System.out.println();
        // }

        // *********** Functions ************
        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        // System.out.println("Enter the second number: ");
        // int b = sc.nextInt();
        // // calculateSum(a, b); //Arguments
        // // System.out.println(factorial(a));
        // System.out.println(binomialCoefficient(a, b));

        // PrimesinRange(10);

        // sum(5, 10);
        // sum(5.5f, 10.5f);

        binaryToDecimal(101);

        sc.close();
    }
}
