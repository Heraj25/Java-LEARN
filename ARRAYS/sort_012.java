package ARRAYS;

import java.util.Scanner;

public class sort_012 {
    public static void main(String[] args) {     
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        sc.close();
        int countzero =0;
        int countone = 0; 
        int counttwo = 0;

        System.out.println("\t THE ORIGINAL ARRAY \t");
        for(int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
        for(int i=0 ; i < n ; i++){
            if(arr[i] == 0)
                countzero += 1;
            if(arr[i] == 1)
                countone += 1;
            if(arr[i] == 2) 
                counttwo += 1;   
            }

        int i=0;
        while(countzero > 0)
        {
            arr[i++] = 0;
            countzero = countzero-1;
        }
 
        while(countone > 0)
        {    
            arr[i++] = 1;
            countone = countone-1;
        }

        while(counttwo > 0)
        {   
            arr[i++] = 2;
            
            counttwo = counttwo -1;
        }

        System.out.println("\t THE ALTERED ARRAY \t");
        for(i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
