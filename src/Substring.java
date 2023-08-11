public class Substring {
    public static void main(String[] args) {
        String text = "Hello there";

        String result  = text.substring(0,text.length() - 5);
        System.out.println("length of text" + text.length());
        System.out.println(" substring  index 0  4:" + result);
        String result1  = text.substring(0,text.length() - 9);
        System.out.println("substring index 0, length 1:  "+result1);
        System.out.println(text.substring(1,5));

    }
}
