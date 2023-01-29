package Firstclass;

import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        int a, b, c, d;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input of a:");
        a = sc.nextInt();
        System.out.println("Enter input of b:");
        b = sc.nextInt();
        System.out.println("Enter input of c:");
        c = sc.nextInt();
        System.out.println("Enter input of d:");
        d = sc.nextInt();


        if(a > b){
            if(c<d){
                System.out.print("I am Kalyan.");
            }
            else if(c>d){
                    System.out.println("I am Sai");

                }
            else{
                System.out.println("I am Sai Kalyan.");
            }
        }
        else{
            System.out.println("I am No One.");
        }
        sc.close();

        }


    }
    

