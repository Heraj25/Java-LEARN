package ARRAYS;

import java.util.Scanner;

public class factorial {
    int fact(int n){
        int val=1;
        for(int i=1; i<= n ; i++){
            val = val*i; 
        }
        return val;
    }   
}

class run{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        factorial obj = new factorial();
        System.out.println("The factorial of "+n+" value is: "+obj.fact(n));
        sc.close();
    }
}
