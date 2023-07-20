package bit_manupulation;

public class clearbit {
    public  static int k(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(k(10,1));
    }
}
