package arrays;

public class max_sub_array {
//    public static boolean max_subarraysum(int[] a) {
//        int curr = 0;
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < a.length; i++) {
//            int z = i;
//            for (int j = i; j < a.length; j++) {
//                int k = j;
//                curr = 0;
//                for (int l = z; l <= k; l++) {
//                    curr = curr + a[l];
//                }
//                System.out.println(curr);
//                if (max < curr) {
//                    max = curr;
//                }
//            }
//        }
//        System.out.println(max);
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int a[] = {2,4,6,10,8};
//
//        System.out.println(max_subarraysum(a));
//  }
   public static void maxsub(int[] a){
       int max=Integer.MIN_VALUE;
       int curr=0;
       for (int i = 0; i <a.length; i++) {
           int s=a[i];
           for (int j = i; j <a.length; j++) {
               int e=a[j];
                curr=0;
               for (int k = s; k <=e; k++) {
                   curr += a[k];
               }
               System.out.println(curr);
                   if(max<curr) {
                       max = curr;
                   }
               }
           }
           System.out.println(max);
       }
       public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        maxsub(a);
    }
}