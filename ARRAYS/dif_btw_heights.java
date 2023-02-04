package ARRAYS;

import java.util.Scanner;
class calc{
    void min_max_calc(int[] ar, int num, int K){
        int max, min;
        for(int i=0 ; i<num ; i++){
            min = ar[i] - K;
            max = ar[i] + K;
            if(min > 0){
                ar[i] = min;
            }
            else{
                ar[i] = max;
            }
        }
    }
}

public class dif_btw_heights {

    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);   
        System.out.print("Enter the total number of elements in the array: ");
        n = sc.nextInt();
        System.out.println("Enter the K th value by which array elements are going to be increased and decreased ");
        k = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Input the elements in the array: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        calc obj = new calc();
        System.out.println();
        System.out.println("\tSTART INITIALIZING THE PROCESS\t");
        obj.min_max_calc(arr, n , k);
        sc.close();

        int maxim = arr[0], minim = arr[0];
        for(int j=1 ; j<n ;j++){
            if(arr[j] > maxim)
                maxim = arr[j];
            if(arr[j] < minim)
                minim = arr[j];
        }

        //print the outputs
        System.out.println("The maximum height of the tower in the array :"+maxim);
        System.out.println("The minimum height of the tower in the array :"+minim);    
        int diff = maxim - minim;
        System.out.println("The minimal difference between the height of the highest and the lowest tower is: "+diff);

    }
}
