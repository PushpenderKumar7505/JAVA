package array_2d_practice;

public class Q3 {
    public static  void trans(int a[][]) {
       int t[][]= new int [3][2];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <2; j++) {
                t[i][j]=a[j][i];
            }
        }
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j <a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        trans(a);
    }
}