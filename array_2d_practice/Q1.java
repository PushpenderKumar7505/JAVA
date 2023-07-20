package array_2d_practice;

public class Q1 {
    public  static void check(int arr[][], int key) {
        int c=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i][j]==key){
                    System.out.println("key is found");
                    c++;
                }
            }

        }
        System.out.println("key is not found");
    }
    public static void main(String[] args) {
int arr[][]={{4,7,8},{8,8,7}};
int key =12;
     check(arr, key);
    }
}
