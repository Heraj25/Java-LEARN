package ARRAYS;

import java.util.Scanner;

public class count_num {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }


        //instead of like this create a seperate method
        //getPairsCount(int[] arr, int n, int k)
        int k;
        k = sc.nextInt();
        int sum;
        int count=0;
        for(int j=0; j<n ; j++){
            for(int l=j+1 ; l<n ; l++){
                sum = arr[j]+arr[l];
                if(sum == k){
                    count = count+1;
                } 
            }
        }
        sc.close();
        System.out.println("The number of addition pairs that can give you the desired number : "+count);
    }
}
