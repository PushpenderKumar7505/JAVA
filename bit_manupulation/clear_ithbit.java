package bit_manupulation;

public class clear_ithbit {
    public static int clerrange(int n , int k, int i ){
        int a=((~0)<<(i+1));
        int b=(1<<k)-1;
        int bitmask= a| b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clerrange(10,2,4));
    }
}
