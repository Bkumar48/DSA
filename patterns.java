import java.util.Scanner;

public class patterns {
    public static void hollowRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print((i == 1 || i == r || j == 1 || j == c) ? "* " : "  ");
            }
            System.out.println();
        }
    }

    public static void rotatedRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedNumberHalfPyramid(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void rotated(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the rows and columns of the rectangle: ");
        // int r = sc.nextInt();
        // int c = sc.nextInt();
        // hollowRectangle(r, c);
        // rotatedRightTriangle(4);
        // rotated(4);
        // invertedNumberHalfPyramid(5);
        // floydsTriangle(5);
        sc.close();
    }
}
