package bit_manupulation;

public class clearith_bit {
    public static int clear(int n, int k){
        int bitmask=(~ 0)<<k;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(clear(15,2));
    }
}
