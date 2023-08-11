public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1="balaji";
        String str2="Balaji";
        String str3="Hi";
        System.out.println(str1.equals(str3) );
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.concat(str3));
        System.out.println(str3.replace('H','o'));
    }
}
