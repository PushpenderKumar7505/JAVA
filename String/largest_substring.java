package String;

public class largest_substring {

    public static class string_shotest_path {
        public static float shortest(String str){
            int x=0;
            int y=0;
            for (int i = 0; i <str.length(); i++) {
                char dir=str.charAt(i);
                if(dir=='w'){
                    x--;
                } else if (dir=='N') {
                    y++;
                } else if (dir=='E') {
                    x++;
                } else {
                    y--;
                }
            }
           int X2=x*x;
            int Y2=y*y;

       return (float)Math.sqrt(X2+Y2);
        }

        public static void main(String[] args) {
            String str="WNEENESENNN";
            System.out.println(shortest(str));
        }


    }
}
