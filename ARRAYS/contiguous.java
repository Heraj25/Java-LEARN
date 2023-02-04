package ARRAYS;

public class contiguous {
    int cont_array(int[] ar){
        int current_sum = 0;
        int max_sum = 0;
        for(int i=0; i<ar.length ; i++){
            current_sum = current_sum + ar[i];
            if(current_sum > max_sum){
                max_sum = current_sum;
            }
            else{
                current_sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {       
        int[] arr = {-4, -5, 1, 6, 8, -3, 9, 3, 1};
        contiguous obj  = new contiguous();
        System.out.println("Find the maximum sum of contiguous Subarray: "+ obj.cont_array(arr));
    }    
}
