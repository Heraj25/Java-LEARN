package Firstclass;

import java.util.Scanner;
public class fibinocci {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    int a=0;
    int b=1;
    n = sc.nextInt();
    int sum;
    sc.close();

    System.out.println(a);
    System.out.println(b);
    for(int i=1 ; i<=n ; i++){
        sum = a+b;
        a = b;
        b = sum;
        System.out.println(sum);
    }
    
}
}
