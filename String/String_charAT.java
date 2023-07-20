package String;

import java.util.Scanner;

public class String_charAT {
    public static void ch(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pan=new String();
        pan=sc.nextLine();
        ch(pan);

    }


}
