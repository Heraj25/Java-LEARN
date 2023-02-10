package arrays2d;

import java.util.Scanner;

public class chess {
    public static void main(String[] args) {
       
        String[][] chess = new String[8][8];

        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j<8 ; j++){
                if(i%2 == 0){
                    if(j%2 == 0){
                        chess[i][j] = "black";
                    }

                    else{
                        chess[i][j] = "white";
                    }
                }

                if(i%2 != 0){
                    if(j%2 == 0){
                        chess[i][j] = "white";
                    }
                    else{
                        chess[i][j] = "black";
                    }
                }            
            }
        }


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y co-ordinate: ");
        int y = sc.nextInt();

        sc.close();
        System.out.println();
        System.out.println("\tOUTPUT\t");
        for(int k=0 ; k<8 ; k++){
            for(int l =0 ; l<8 ; l++){
                if(x == k && y == l){
                    System.out.print(chess[k][l]);
                }
            }
        }
        }
    
}
