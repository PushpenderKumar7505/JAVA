package bit_manupulation;

public class power_of_two {
    public static int poweroftwo(int b){
        int i = b & (b - 1);
        return i;

    }
    public static void main(String []args){
        System.out.println(poweroftwo(8));
    }
}
