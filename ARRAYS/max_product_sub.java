package ARRAYS;
import java.util.Scanner;
public class max_product_sub {
    
    int maxProductS(int a[]) {
	    int result = Integer.MIN_VALUE;
	    for(int i=0;i<a.length-1;i++){
            int p = a[i];
	        for(int j=i+1;j<a.length;j++) {
	            result = Math.max(result,p);
	            p *= a[j];
	        }
	        result = Math.max(result,p);
        }
	   return result;
	}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        max_product_sub obj = new max_product_sub();
        System.out.println("The max product subarray of the following array: "+obj.maxProductS(arr));
        sc.close();
    }

}
 