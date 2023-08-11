import javax.swing.text.Element;

public class ArraySum {

    public static void main(String[] args) {

        //below line no 9 to 11 for string array
        String[] stringNames = {"Jack", "william", "Heron"};

        for(String str_name : stringNames){
            System.out.println(str_name);
        }
        System.out.println(stringNames[1]);
        int[] arr = {10, 8, 6, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of the all elements array: " + sum);

        int[] arr1 = {2, 5, 8, 9};
        int sum1 = 1;
        for (int i = 0; i < 2; i++) {
            sum1 += arr1[i];
        }
        System.out.println("Sum of all elements <2:" + sum1);

        for (int i = 0; i < arr1.length; i++) {
            if (arr[i] % 2 == 0) {

            }
            System.out.println("\nEven numbers in 'arr1':");
            System.out.println(arr1[i]);
        }
    }
}







