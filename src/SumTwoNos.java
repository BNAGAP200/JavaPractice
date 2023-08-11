import java.util.Scanner;

public class SumTwoNos {
    public static void main(String[] args) {

       /* int var1= 100;
        int var2= 200;
        int sum= var1+var2;
        System.out.println(sum);*/
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("Entered value of num1: " + a);

        int b = scn.nextInt();
        System.out.println("Entered value of num2: : " + b);

        int c= a+b;

        System.out.println("Sum of two nums:"+ (a+b));
    }



}


