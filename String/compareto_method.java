package String;

public class compareto_method {
    public static void main(String[] args) {
//        /String s[]={"panakj","radhe","Shyam","shivam"};
        String s[]={"apple","mango","banana"};
        String largest=s[0];
        for (int i = 1; i <s.length ; i++) {
            if(largest.compareTo(s[i])<0){
largest=s[i];
            }
        }
        System.out.println(largest);
        
    }
}
