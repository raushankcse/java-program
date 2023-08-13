package oops;

public class OopsParameterConstructor {
    public static void main(String args[])
    {
        Student s1 = new Student();
        // Student s2 = new Student("shradha");
        // Student s3 = new Student(123);
        s1.name = "Raushan";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        Student s2 = new Student(s1);
        s2.password = "xyz";



    }
    
}

class Student{
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student(){

    }
    Student(Student s1)

    {
        System.out.println("Contructor is called..");
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }
    // Student(String name)
    // {
    //     this.name = name;
    // }
    // Student(int roll)
    // {
    //     this.roll=roll;
    // }
}
