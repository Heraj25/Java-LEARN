package Firstclass;

import java.util.Scanner;

public class factorial {

    static int factoriall(int N){
        //code here        
        int fac=1;
        for(int i=1; i<=N ; i++){
            fac = fac*i; 
        }
        return fac;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println();
        sc.close();
        System.out.println("The factorial of value "+n+" is: "+factoriall(n));
    }
}
