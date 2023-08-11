import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num=scn.nextInt();

        String str = scn.nextLine();

        System.out.println("num is assigned: " + num);

        System.out.println("name is assigned: " + str);
    }
}
