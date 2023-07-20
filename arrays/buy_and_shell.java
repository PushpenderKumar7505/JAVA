package arrays;

public class buy_and_shell {
    public static int buy(int a[]){
        int buy_prices=Integer.MAX_VALUE;
        int profit=0;
        for (int i = 0; i <a.length; i++) {
            if(buy_prices<a[i]){
              int  prof=a[i]-buy_prices;
                profit=Math.max(profit,prof );
            }
       else {
           buy_prices=a[i];
            }
        }
return  profit;
    }
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        System.out.println(buy(a));
    }
}
