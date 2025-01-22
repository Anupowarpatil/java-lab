import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        String str1 = "xyzyx";
        // Scanner sc = new Scanner(System.in);
        // str1 = sc.next();

        String str2 = new StringBuilder(str1).reverse().toString();

        if (str1 == str2) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }

    }
}
