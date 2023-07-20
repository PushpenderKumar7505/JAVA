package arrays;

public class trappedwater {
    public static int trapp(int a[]) {
        int leftMax[] = new int[a.length];
        leftMax[0] = a[0];
        for (int i = 1; i < a.length; i++) {
            leftMax[i] = Math.max(a[i], leftMax[i - 1]);
        }

        int rightmax[] = new int[a.length];
        rightmax[a.length - 1] = a[a.length - 1];
        for (int i = a.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(a[i], rightmax[i + 1]);
        }
        int trapwater = 0;
        for (int i = 0; i < a.length; i++) {
            int waterlevel = Math.min(leftMax[i], rightmax[i]);
            trapwater += waterlevel - a[i];
        }
        return trapwater;
    }
    public static void main(String[] args) {
        int a[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapp(a));
    }}
