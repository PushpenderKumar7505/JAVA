package two_d_array;

public class search_in_sorted_array {
    public static  boolean sorted_search(int a[][],int k){
        int row=0;
        int clmn=a.length-1;
        while (row<a.length-1 && clmn>=0){
            if(k==a[row][clmn]){
                System.out.println("key is found");
                System.out.println("("+ row+ ","+ clmn+")");
                return true;
            } else if (k<a[row][clmn]) {
                clmn--;
            }
     else {
         row++;
            }
        }
        System.out.println("key is not found");
  return  false;
    }
    public static void main(String[] args) {
         int a[][]= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
         int k=12 ;
        System.out.println(sorted_search(a,k));

    }
}
