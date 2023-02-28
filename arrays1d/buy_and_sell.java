package arrays1d;

import java.util.Scanner;

public class buy_and_sell {
    public int maxProfit(int[] prices) {
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a ; i++){
            arr[i] = sc.nextInt();
        }

        //create an object of the class
        buy_and_sell obj = new buy_and_sell();
        System.out.println(obj.maxProfit(arr));
        sc.close();
    }
    
}
