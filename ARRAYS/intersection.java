package ARRAYS;

public class intersection {
    static void intersect(int[] arr, int[] ar){
        for(int i=0; i<arr.length ; i++){
            for(int j=0; j<ar.length ; j++){
                if(arr[i] == ar[j]){
                    System.out.print("\t"+arr[i]+"\t");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,4,8,2};
        int[] ar = {3,6,9,7,1};
        System.out.println("\t THE INTERSECTION BETWEEN TWO ARRAYS \t");
        intersect(arr, ar);
    }
}
