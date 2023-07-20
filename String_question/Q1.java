package String_question;

public class Q1 {
    public static void main(String[] args) {
        String s="pankaouj";
        int count=0;
        for (int i = 1; i <s.length(); i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
