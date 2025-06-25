package Methodoverloading;

public class Lab174_MOloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        System.out.println(m1.add(3,4));
        System.out.println(   m1.add(5,6,7));
        System.out.println( m1.add(2.3,3.4));
    }
}
