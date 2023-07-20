package sorting;

public class selectionsort {
        public  static void selection(int a[]){
        for (int i = 0; i <a.length-1; i++) {
            int min=i;
            for (int j = i+1; j <a.length; j++) {
                if(a[min]>a[j]){
                    min=j;
                }
            }
      int temp=a[min];
            a[min]=a[i];
            a[i]=temp;

        }
    }
    public static void print(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        int a[]={4,45,8,7,5,50};
selection(a);
print(a);
    }

}