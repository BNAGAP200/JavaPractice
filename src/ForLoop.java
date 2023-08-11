import java.util.Scanner;

public class
ForLoop {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i= scn.nextInt() ; i<20 ; i++) {
            if (i%2==0){
                System.out.println(i);
            }


        }
    }
}