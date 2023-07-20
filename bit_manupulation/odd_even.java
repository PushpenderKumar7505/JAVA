package bit_manupulation;

public class odd_even {
    public static void oddEven(int n){
        int BitMask=1;
        if((n&1)==0){
            System.out.println("even");
        }

  else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        oddEven(66);
    }
}
