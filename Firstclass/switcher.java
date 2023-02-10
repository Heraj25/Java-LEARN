package Firstclass;

import java.util.Scanner;

public class switcher {

    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i=1 ; i<=x ; i++){
            switch(i){
                case 1: 
                    System.out.println("I am Heraj.");
                    continue;

                case 2:
                    System.out.print("I was born in paralakehmundi.");
                    continue;
                case 3:
                    System.out.println("Born to Dream");
                    continue;

                default:
                    System.out.println("\t END \t");
            }
        }
        sc.close();

    }
    
}
