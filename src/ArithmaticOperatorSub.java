import java.util.Scanner;

public class ArithmaticOperatorSub {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("Entered value of num1: " + a);

        int b = scn.nextInt();
        System.out.println("Entered value of num2: : " + b);

        int c= a+b;
        System.out.println("Sum of two nums:"+c);

        int d= a-b;
        System.out.println("Sub of two nums:"+d);
        int e= a*b;
        System.out.println("mul of two nums:"+e);
        int f= a/b;
        System.out.println("div of two nums:"+f);
        int g= a%b;
        System.out.println("mod of two nums:"+g);




        int n1 = scn.nextInt();
        System.out.println("Number = " + n1);

        int n2 = scn.nextInt();
        System.out.println("Number = " + n2);
        n1 = -n1;
        n2= -n2;
        System.out.println("Result = " + n1);
        System.out.println("Result = " + n2);
    }
    }

