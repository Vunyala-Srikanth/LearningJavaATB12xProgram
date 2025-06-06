package ex_05_TypeCasting;

public class Lab061_TypCasting_Used {
    public static void main(String[] args) {
        int course=100;
        float  GST= 18.54f;
        // int total1 = course+GST; // Narrowing - Implicit
        int total= course+(int)GST;
        System.out.println(total);



    }
}
