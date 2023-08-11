import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int time = 22;
        if (time <scn.nextInt()) {
            System.out.println("good morning");
        } else if (time <scn.nextInt()) {
            System.out.println("god evening");
        } else {
            System.out.println("good night");
        }

    }
}
