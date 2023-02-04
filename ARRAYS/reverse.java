package ARRAYS;

import java.util.Scanner;

class array{
    void reversearray(int[] arr, int num){
        int[] rev_arr = new int[num];
        int b = num;
        for(int j=0; j<num ; j++){
            rev_arr[j] = arr[b-1];
            b--;
        }
        
        /*Print the reverse order of the array */        
        System.out.println("The reverse order of the elements of the array are: ");
        for(int l=0 ; l<num; l++){
            System.out.println(l+". "+rev_arr[l]);
        }
    }
}

public class reverse {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        n = sc.nextInt();
        
        /*User input the array elements */

        System.out.println("The elements in the array are: ");
        int[] ar = new int[n];
        for(int i=0; i<n ; i++){
            ar[i] = sc.nextInt();
        }

        //Printing the Original array

        System.out.println("The original order of elements in the array: ");
        for(int k=0; k<n ; k++){
            System.out.print(k+". "+ar[k]);
            System.out.println();
        }

        //create object of array class

        array obj = new array();
        obj.reversearray(ar, n);
        sc.close();      
    }    
}
