package ARRAYS;

import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the total number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the elements in the array: ");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int dup =0;     
        //objective is to return the duplicated number
        for(int j=0; j<n ; j++){
            for(int k=j+1 ; k<n ; k++){
                if(arr[j] == arr[k] )
                            dup =arr[j];
            }
        }
        System.out.println("The duplicated number in the array is: "+dup);
        sc.close();
    }
}
