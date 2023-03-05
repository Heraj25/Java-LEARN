package constructor;

public class main {
    
    String name;
    int year;

    public main(int myear, String mname){
        year = myear;
        name = mname;
    }

    public static void Main(String[] args) {
        main obj = new main(2002, "mustang");

        System.out.println(obj.year +" "+ obj.name );

    }
}
