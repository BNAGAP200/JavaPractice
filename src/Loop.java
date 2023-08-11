import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        while (i%2==0) {
            System.out.println(i);
            i++;

        }
    }
}
