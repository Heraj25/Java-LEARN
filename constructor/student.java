package constructor;

class details{
    String name;
    int rollno, marks;

    public details(String sname, int sroll, int smarks){
        name = sname;
        rollno = sroll;
        marks = smarks;
    }

}

public class student {
    public static void main(String[] args) {
            details st = new details("Heraj", 16, 90);

            System.out.println(st.name+"  Roll No:"+st.rollno+" Marks:"+st.marks);


    }    
}
