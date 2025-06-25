package Methodoverriding;

public class Lab175 {
    public static void main(String[] args) {
        Srikanth sv = new Srikanth();
        sv.Home();
        sv.p1();

        Father overf = new Father();
        overf.Home();
        overf.f1();

        Father overf2= new Srikanth();
        overf2.Home();
    }

}
