package arrays1d;



class Student{
    String name;
    int roll;
    int marks;
}


public class arrobj {
    

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Heraj";
        s1.roll = 16;
        s1.marks = 90;


        Student s2= new Student();
        s2.name = "Mani";
        s2.roll = 10;
        s2.marks = 00;

        Student stu[] = new Student[2];
        stu[0]= s1;
        stu[1] = s2;       

        for(int i=0 ; i<stu.length ; i++){
            System.out.println(stu[i].name+" ROLL: "+stu[i].roll+ " MARKS: "+stu[i].marks);
        }



    }
}
