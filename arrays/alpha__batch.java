package arrays;


public class alpha__batch{
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
////        int a = s.nextInt();
//        for (int i = 0; i <= 5; i++) {
////            for (int j = 0; j <= 5; j++) {
//                System.out.println("****");
//            }


//         while loop

//        int count=0;
//        while(count<10)
//        {
//            System.out.println("hello");
//            count++;
//        }

//        for (int i = 0; i <=10 ; i++) {
//         System.out.println(i);
//        }

//        int a=0;
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }

//        print the sum of n natural no


//        Scanner s= new Scanner(System.in);
//        int a =s.nextInt();
//      int sum=0;
//        int b=0;
//        while(b<=a){
//            sum=sum+b;
//            b++;
//
//        }
//        System.out.println(sum);
//int a=1234;
//int sum=0;
//while (a!=0){
//  int b =a%10;
//  sum=sum*10+b;
//  a=a/10;
//
//    System.out.println(sum);
//}
//        Write a program that reads a set of integers, and then prints the sum of the
//        even and odd integers

//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        int sum = 0,count=0;
//        for (int i = 0; i <a; i++) {
//           if(i%2==0)
//           {
//               System.out.println(count);
//               System.out.println("even");
//               count=count+i;
//           }
//
//else{
//               System.out.println(count);
//               System.out.println("odd");
//               count=count+i;
//           }
//
//        }


//                int number;
//                int choice;
//                int evenSum = 0;
//                int oddSum = 0;
//                do {
//                    System.out.print("Enter the number ");
//                    number = s.nextInt();
//                    if( number % 2 == 0) {
//                        evenSum += number;
//                    } else {
//                        oddSum += number;
//                    }
//                    System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
//                            choice = s.nextInt();
//                } while(choice==1);
//                System.out.println("Sum of even numbers: " + evenSum);
//                System.out.println("Sum of odd numbers: " + oddSum);
//            }
//        }

//        int num,i,even=0,odd=0;
//        num=s.nextInt();
//        for( i=1;i<=num;i++){
//            if(i%2==0){
//                even+=i;f
//            }
//            else{
//                odd+=i;
//            }
//        }
//        System.out.println(even);
//        System.out.println(odd);
//


//       find the factorial of an number


//        int a = s.nextInt();
//        int b = 1;
//        for (int i = 1; i<=a; i++)
//{
// b=b*i;
//}
//        System.out.println(b);
//    }
//}

//reverse of a given no


//int n=456;
//int rem ,sum=0;
//while(n!=0){
//    rem=n%10;
//    sum=sum*10+rem;
//    n=n/10;
//}
//        System.out.println(sum);

//        int n=5;
//        int b=0;
//        for (int i = 1; i <5; i++) {
//             b=n*i;
//            System.out.println("table is :" + b);
//        }
//


//        pattern questions
//   to print the star pattern
//          int n=5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        inverted star pattern

//        for (int i = 1; i <=4; i++) {
//            for (int j = 4; j >=i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//


//        print half pyramid
//        for (int i = 1; i <=4 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//


//        print character pattern
//     int a=4;
//     char c='A';
//        for (int i = 1; i <=a; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(c);
//                c++;
//            }
//            System.out.println();  }
//    }
//}
//}


//                           topic-function
//

//                in case of void


//    public static void printhello() {
//        System.out.println("hello world");
//        return;
//    }
//
//    public static void main(String[] args) {
//        printhello();
//    }


//    in case of int and other return type


//        public static int printhello() {
//        System.out.println("hello world");
//            System.out.println("hello world");
//            System.out.println("hello world");
//
//        return 0;
//    }
//
//    public static void main(String[] args) {
//        printhello();
//    }

//    function calling with parameter
//public  static int calc(int a, int b){
//    int sub = a-b ;
//    System.out.println(sub);
//    return 1;
//}
//    public static void main(String[] args) {
//        int a =5;
//        int b=3;
//      calc(5,3);
//}

//fuction caling multiplication
//
//    public static int mul(int a, int b){
//        int ans=a*b;
//        System.out.println(ans);
//        return ans;
//    }
//
//    public static void main(String[] args) {
//       int a=5;
//       int b=4;
//        mul(5,4);
//    }

//
//
//                                call by value


//    public static void swap(int a, int b){
//        int temp =a;
//        a=b;
//        b=temp;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        int a= 10;
//        int b=5;
//        swap(10,5);
//        System.out.println(a);
//        System.out.println(b);
//    }


//     product of 2 number

//    public static int pro(int a , int b){
//        int c=a*b;
//        return c;
//
//    }
//
//    public static void main(String[] args) {
//        int a=5;
//        int b=6;
//       int z= pro(5,6);
//        System.out.println(z);
//
//    }

//     to find thefactorial of a number

//   public static int fact(int n) {
//        int f = 1;
//        for (int i = 1; i <= n; i++) {
//            f= f * i;
//        }
//        return f;
//    }
//    public static void main(String[] args) {
//      int z= fact(5);
//        System.out.println(z);
//    }


//                           binary factorial of a no


//public  static int binfact(int n, int r) {
//int fact_n=fact(n);
//int fact_r=fact(r);
//int fact_nmr=fact(n-r);
//int binfact=fact_n / (fact_nmr * fact_r);
//return binfact;
//}
//
//    public static void main(String[] args) {
//        System.out.println(binfact(4,3));
//    }


//                          function overloading(using parameter)
//
//    public static int sum(int a, int b){
//       return a+b;
//
//    }
//    public static int sum(int a, int b, int c){
//       return a+b+c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(sum(5,4));
//        System.out.println(sum(5,3,2));
//    }

//                          fuction overloading (using datatypes)


//public  static int sum(int a, int b){
//       return a+b;
//
//}
//public static float sum(float a, float b){
//       return a+b;
//
//}
//
//    public static void main(String[] args) {
//        System.out.println(sum(4,5));
//        System.out.println(sum(3.2f,4.2f));
//    }


//check no is prime or not

//
//    public static boolean prime(int n)
//    {
//        if(n==2){
//            return true;
//        }
//        for (int i = 2; i <n-1; i++) {
//            if(n%i==0)
//            {
//                return false;
//            }
//        }
//  return true;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(prime(8));
//    }


//     pattern new version

//    print hollow rectangle pattern
//  public  static void holl(int rows, int col){
//      for (int i = 1; i <= rows; i++) {
//          for (int j = 1; j <= col; j++) {
//              if(i==1 || i==rows || j==1 || j==col){
//                  System.out.print("*");
//              }
//        else {
//                  System.out.print(" ");
//              }
//          }
//          System.out.println();
//      }
//return;
//  }
//
//    public static void main(String[] args) {
//holl(4,5);
//
//    print half pyramid
//    public static void tri(int row){
//        for (int i = 1; i <=row; i++) {
//            for (int j = 1; j <=row-i ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//
//    public static void main(String[] args) {
//        tri(4);
//
//    }

//    inverted half pyramid number

//    public static void half_pyramid_number(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.print(" ");
//
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        half_pyramid_number(4);
//    }

//     flyods triangle

//     public static  void floyd(int n ){
//    int count=1;
//         for (int i = 1; i<=n ; i++) {
//             for (int j = 1; j <=i; j++) {
//                 System.out.print(count + " ");
//                 count++;
//             }
//             System.out.println();
//         }
//     }
//
//    public static void main(String[] args) {
//        floyd(5);
//    }

//    0-1 triangle
//    public static void tri(int n){
//        for (int i = 1; i <=n; i++) {
//            for (int j = 1; j <=i; j++) {
//                if ((i + j) % 2 == 0) {
//                    System.out.print("1");
//                } else {
//                    System.out.print("0");
//                }
//
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        tri(5);
//    }
//                   array

//   public static void update(int marks[]){
//       for (int i = 0; i <marks.length; i++) {
//          marks[i]= marks[i] + 1;
//       }
//   }
//    public static void main(String[] args) {
//        int marks[] = {1, 2, 3, 4};
//        update(marks);
//        for (int i = 0; i < marks.length ; i++) {
//            System.out.print(marks[i]);
//        }
//        System.out.println();
//    }

//                              linear search in java
//    public static int linear_search(int arr[], int n) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == n) {
//                return i;
//            }
//        }
//        return -1;
//
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int n = 2;
//        int x = linear_search(arr, 2);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        if (x == -1) {
//            System.out.println(" no is not found");
//        } else {
//            System.out.println("no is found");
//        }
//    }
//                      largest value in java


//    public static int largest(int arr[]) {
//        int x = Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if (x < arr[i]) {
//                x = arr[i];
//            }
//        }
//        return x;
//    }
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 6, 7};
//        int x=largest(arr);
//        System.out.println(x);
//    }
//                   smallest value in java


        //public  static  int smallest(int a[]){
//    int x=Integer.MAX_VALUE;
//    for (int i=0;i<a.length;i++)
//    {
//        if(x>a[i]){
//            x=a[i];
//        }
//    }
//return x;
//}
//    public static void main(String[] args) {
//        int a[]={2,3,4,5,6,7,8,9,10};
//        System.out.println("smallest value is :" + smallest(a));
//    }

//                 find the index of the given digit


//    public static int mid(int a[], int k) {
//        int s = 0;
//        int e = a.length - 1;
//        while (s <= e) {
//            int m = (s + e) / 2;
//            if (a[m] == k) {
//                return m;
//            }
//            if (a[m] < k) {
//                s = m + 1;
//            } else {
//                e = m - 1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int a[] = {1, 2, 3, 4, 5, 6, 7, 9};
//        int k = 5;
//        System.out.println(mid(a, k));
//
//    }
        //reverse array

//    public static void reverse(int[] a){
//        int s=0; int e=a.length-1;
//        while(s<e){
//            int temp=a[e];
//            a[e]=a[s];
//            a[s]=temp;
//            s++;
//            e--;
//        }
//    }
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5,6,7,8};
// reverse(a);
//        for (int i = 0; i <a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println();
//        }
//    }

        //    pair with a number
    
//public static  void pair(int a[]){
//    for (int i = 0; i <a.length; i++) {
//        int curr= a[i];
//        for (int j = 0; j <a.length; j++) {
//            System.out.println("("+curr +","+ a[j] +")");
//        }
//    }
//}
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5,6};
//        pair(a);
//    }
    }

