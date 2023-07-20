package String;

public class String_compression {
    public static String compress(String str) {
        String s ="";

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;

            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            s += str.charAt(i);
            if (count > 1) {
                s += count.toString();
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String str="rajaaram";
        System.out.println(compress(str));
    }
}
