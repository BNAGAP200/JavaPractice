import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if ((a < b) && (b == c)) {
            int d = a + b + c;
            System.out.println(" sum of three nos" +d);




        }

    }
}