import java.util.Scanner;
public class patterns {
    public static void hollowRectangle(int r, int c){
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <=c; j++){
                System.out.print((i == 1 || i == r || j == 1 || j == c) ? "* " : "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns of the rectangle: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        hollowRectangle(r, c);
        sc.close();
    }
}
