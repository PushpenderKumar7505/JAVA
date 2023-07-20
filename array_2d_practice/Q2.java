package array_2d_practice;

public class Q2 {
    public static  int sum(int arr[][]){
        int c= 0;
        for (int i = 1; i <=1; i++) {
            for (int j = 0; j < arr.length ; j++) {
            c+=arr[i][j];
            }
        }
        System.out.println("the sum is :");
        System.out.println(c);
        return  c;
    }
    public static void main(String[] args) {
        int arr[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum(arr);
    }
}
