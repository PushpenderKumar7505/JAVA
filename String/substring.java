package String;

public class substring {
    public static String sub(String str, int se, int ed){
        String s="";
        for (int i = se; i <ed; i++) {
              s+=str.charAt(i);
        }
   return s;
    }
    public static void main(String[] args) {
        String str="pankajbsdhvwygfiygkukj";
        System.out.println(sub(str,1,5));
    }


}
    