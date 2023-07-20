package arrays;

public class pair {
    public static  void pairs(int a[]){
        for (int i = 0; i < a.length; i++) {
            int curr=a[i];
            for (int j = i+1; j <a.length; j++) {
                System.out.print("("+ curr + "," + a[j] +")");
            }

        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        pairs(a);
    }

}
