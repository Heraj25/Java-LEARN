package Firstclass;

import java.util.Scanner;
public class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
         for(int i=0; i<=nums.length - 2; i++){
             for(int j=1; j<=nums.length -1; j++){
                 if(nums[i]+nums[j] == target)
                 {
                       result[0] = i;
                       result[1] = j;
                 }
             }
         }
         return result;
    }
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n,target;
         n = sc.nextInt();
         int[] nums = new int[n];
         for(int a=0; a<n ; a++){
             nums[a] = sc.nextInt();
         }

         target = sc.nextInt();

         twosum obj = new twosum();
         for(int k=0; k<2 ; k++){
             System.out.print(obj.twoSum(nums, target));
         }

         sc.close();

     } 
}
    

