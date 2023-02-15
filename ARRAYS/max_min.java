package ARRAYS;

import java.util.Scanner;

class max{
    double ret_max(double[] arr, int num){

        double maxim=arr[0];
        

        for(int j=1 ; j<num ; j++){
            if(arr[j] > maxim)
                maxim = arr[j];
        }

        return maxim;
    }
}

class min{
    double ret_min(double[] ar, int nu){

        double minim=ar[0];

        for(int j=1 ; j<nu ; j++){
            if(ar[j] < minim)
                minim = ar[j];
        }

        return minim;
    }
}

public class max_min {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the total number of elements in the array: ");
        n = sc.nextInt();

        double[] array = new double[n];

        System.out.println("Enter the elements in the array: ");
        for(int i =0 ; i<n ; i++){
            array[i] = sc.nextDouble();
        }

        /*Create objects for the respective functions in different classes */
        max maxobj = new max();
        min minobj = new min();

        System.out.println("The minimum value in the array: "+minobj.ret_min(array, n));

        System.out.println("The maximum value in the arrat: "+maxobj.ret_max(array, n));

        sc.close();
    }
    
}
