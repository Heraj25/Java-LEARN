package Firstclass;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int digit=0;
        int count_digit=0;
        int a = n;
        while(a>0){
            a = n/10;
            count_digit = count_digit+1;
        }

        sc.close();
        int fk = n;
        double sum=0;

        while(n > 0){
            digit = n%10;
            n = n/10;
            sum = sum + (Math.pow(digit,count_digit));            
        }
        
        if(sum == fk){
            System.out.print("IT IS AN ARMSTRONG NUMBER");
        }
        else{
            System.out.print("NOT AN ARMSTRONG NUMBER");
        }


    }
    
}
