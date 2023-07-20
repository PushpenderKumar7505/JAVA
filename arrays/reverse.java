package arrays;

public class reverse {
    public static void rev(int a[]){
        int s=0; int e=a.length-1;
        while(s<e){
            int temp=e;
            e=s;
            s=temp;
            s++;
            e--;
        }

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        rev(a);
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
