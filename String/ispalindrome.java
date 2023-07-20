package String;

import java.util.Scanner;

public class ispalindrome {
    public static boolean palindrome(String pa) {
        for (int i = 0; i < pa.length() / 2; i++) {
            int n = pa.length();
            if (pa.charAt(i) != pa.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pa = new String();
        pa = sc.nextLine();
        System.out.println(palindrome(pa));
    }
}

