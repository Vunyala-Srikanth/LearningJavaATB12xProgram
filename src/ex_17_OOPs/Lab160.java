package ex_17_OOPs;

public class Lab160 {
    public static void main(String[] args) {
        Student s1 = new Student();
//s1.name="Srikanth";
        System.out.println(s1.name="Srikanth");
        //1. Student - Class Loading
        //2. s1 - Object Ref.
        //3. new Student() -> Object creation
    }
}

    class Student{
        String name;
        int roll;
    }

