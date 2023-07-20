package sorting;

public class bubble_sort {
    public static void bubble_sort(int a[]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
}
    public static void printarr(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[]={4,5,2,7,1,60};
        bubble_sort(a);
        printarr(a);

    }
}
