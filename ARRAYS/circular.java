package ARRAYS;

import java.util.Scanner;

public class circular {

    static void circle_array(int[] arr , int n){
        
        int temp = arr[0];
        
        for(int i=0 ; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;

        System.out.println("\t THE CONTENTS OF THE ARRAY \t");
        for(int j=0 ; j<n ; j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of total number of elements in the array: ");
        n = sc.nextInt();

        System.out.println("Input the elements in the array: ");
        int[] ar = new int[n];
        for(int i=0; i<n ; i++){
            ar[i] = sc.nextInt(); 
        }
        sc.close();
        for(int j=0 ; j<n ; j++){
            circle_array(ar, n);
        }
    }
    
}
