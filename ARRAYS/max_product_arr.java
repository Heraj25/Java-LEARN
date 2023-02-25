package ARRAYS;

import java.util.Scanner;

public class max_product_arr {
    int product(int[] a){

        int result = Integer.MIN_VALUE;
        for(int i=0 ; i<a.length ; i++){
            int pro = a[i];
            for(int j=i+1 ; j<a.length ; j++){
                result = Math.max(result, pro);
                pro = pro*a[j];
            }
            result = Math.max(result, pro);
        }
        return result;
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        max_product_arr obj = new max_product_arr();
        System.out.println("The maximum subarray product is: "+obj.product(arr));
        sc.close();
    }
}
