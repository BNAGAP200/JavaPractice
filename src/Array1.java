public class Array1 {
    public static void main(String[] args) {

        int[] a = {2, 3, 4, 6, 8, 9, 10, 11, 12};
        for (int val : a) {
            if (val % 2 == 0) {
                System.out.println("even numbers " + val);
                int[] numbers = {1, 2, 3, 4, 5};

                // Traditional for loop to access both index and element
                for (int i = 0; i < numbers.length; i++) {
                    int num = numbers[i];
                    System.out.println("Index: " + i + ", Element: " + num);
                }
            }
        }

            }/* else {
                System.out.println("not applicable");
            }*/

          /*int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
            for (int i = 1; i <= 11; i++) {
                if (i % 2 == 0) {

                    System.out.print(":" + b);
                }
            }*/
        }

