package arrays;
public  class sub{
   public static void sub(int arr[]){
       for (int i = 0; i <arr.length; i++) {
           int s=arr[i];
           for (int j = i; j < arr.length ; j++) {
              int z=arr[j];
               for (int l = s; l <=z; l++) {
                   System.out.print(l);
               }
               System.out.println();
           }
           System.out.println();
       }

   }
    public static void main(String []args){
        int arr[]={1,2,3,4,6,8,9,10,11};
         sub(arr);
    }
}

