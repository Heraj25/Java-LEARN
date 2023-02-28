package arrays1d;


import java.util.Scanner;

public class common_sort {

    int[] common(int[] a, int[] b, int[] c, int n1, int n2, int n3){

        /* 
        int x , y, z;
         
        for(int i=0; i<n1 ; i++)
            for(int j=i+1 ; j<n1 ; j++){
                if(a[i] > a[j]){
                    x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }

        for(int i=0; i<n2 ; i++){
            for(int j=i+1 ; j<n2 ; j++){
                if(b[i] > b[j]){
                    y = b[i];
                    b[i] = b[j];
                    b[j] = y;
                }
            }
        }
               
        for(int i=0 ; i<n3 ; i++){
            for(int j=i+1 ; j<n3 ; j++){
                if(c[i] > c[j]){
                    z = c[i];
                    c[i] = c[j];
                    c[j] = z;
                }
            
            }
        }
        */

        int[] result = new int[5];
        int i=0;
        for(int s=0 ; s<n1 ; s++){
            for(int t=0 ; t<n2 ; t++){
                for(int u=0 ; u<n3 ; u++){
                    if(a[s] == b[t] && b[t] == c[u] && c[u] == a[s]){
                        result[i++] = a[s];
                        return result;
                    }
                }
            }
        }

        return result;
       

    }


    public static void main(String[] args) {
        
        int m,n,o;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n = sc.nextInt();
        o = sc.nextInt();

        System.out.println("\tINITIALIZE ARRAYS WITH ELEMENTS\t");

        int[] a = new int[m];
        int[] b = new int[n];
        int[] c = new int[o];


        System.out.println("\t1st ARRAY\t");
        for(int i=0 ; i<m ; i++){
            a[i] = sc.nextInt();
        }


        System.out.println("\t2nd ARRAY\t");
        for(int j=0; j<n ; j++){
            b[j] = sc.nextInt();
        }


        System.out.println("\t3rd ARRAY\t");
        for(int k=0 ; k<o ; k++){
            c[k] = sc.nextInt();
        }

        sc.close();
        common_sort obj = new common_sort();

        System.out.print("The common elements in the 3 sorted arrays are: "+obj.common(a, b, c, m, n, o));

    }
}
    

