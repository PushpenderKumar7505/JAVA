package two_d_array;

public class diagonal_sum {
//    public static int gi(int a[][]) {
//        int sum = 0;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                if (i == j) {
//                    sum += a[i][j];
//                } else if (i + j == a.length - 1) {
//                    sum += a[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        System.out.println(gi(a));
//    }
//}


        //      or other type for better time complexity


        public static int gi(int a[][]) {
            int sum = 0;
            for (int i = 0; i <a.length ; i++) {
sum+=a[i][i];
if(i!=a.length-1-i)
sum+=a[i][a.length-1-i];
            }
     return  sum;
        }
        public static void main(String[]args) {
            int a[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
            System.out.println(gi(a));
        }

}
