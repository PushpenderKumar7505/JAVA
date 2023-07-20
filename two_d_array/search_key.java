package two_d_array;

import java.util.Scanner;

public class search_key {
    public static  boolean sea(int a[][], int key){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == key) {
                    System.out.print("key is found");
                    return true;
                }
            }
        }
        System.out.print("key is not found");
 return  false;
    }
    public static void main(String[] args) {
        int a[][]=new int [3][3];
        int key =10;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
sea(a,key);
}
}
