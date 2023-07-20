package two_d_array;

import java.util.Scanner;

public class spiral_array {
    public static  void spiral(int a[][]){
        int strtrow=0;
        int strtcol=0;
        int endrow=a.length-1;
        int endcol=a.length-1;
        while(strtrow<=endrow && strtcol<=endcol) {
            //top
            for (int j = strtcol; j <= endcol; j++) {
                System.out.print(a[strtrow][j] + " ");
            }
            //right
            for (int i = strtrow+1; i <=endrow ; i++) {
                System.out.print(a[i][endcol]+ " ");

            }
            //bottom
            for (int j = endcol-1; j >=strtcol ; j--) {
                if(strtrow==endrow){
                    break;
                }
                System.out.print(a[endrow][j]+" ");
            }
            //left
            for (int i = endrow-1; i >=strtrow+1 ; i--) {
                if(strtcol==endcol){
                    break;
                }
                System.out.print(a[i][strtcol] + " ");
            }
       strtcol++;
            strtrow++;
            endcol--;
            endrow--;
        }
//        System.out.println();
    }
    public static void main(String[] args) {
       int a[][]= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
   spiral(a);
    }
}

