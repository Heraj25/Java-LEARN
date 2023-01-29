import java.util.Scanner;


class bool{
    public static void main(String[] args) {
        boolean flag;
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of a: ");
        a = sc.nextInt();
        System.out.println("The value of b: ");
        b = sc.nextInt();

        if(a > b)
           flag = true;
        else 
           flag = false;
        
        if(flag)  // works for only true
        {
            System.out.println("Heraj is a responsible person.");
        }
        
        sc.close();

    }
}