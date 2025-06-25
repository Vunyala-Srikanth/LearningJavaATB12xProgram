package singleinheritance;

public class Lab168_SI {
    public static void main(String[] args) {
        son sa = new son();
        sa.bhk3();
        sa.bhk2();
        System.out.println(sa.gold_f);
        cousin ca = new cousin();
        ca.bhk31();
       // ca.bhk3(); cannot access because cousin can't extends the father

    }
}
