package ex_06_Ternary_Operator;

public class Lab064_Interview_Ready_Question {
    public static void main(String[] args) {
        // Nested Ternary
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);
        int age =29;
        String result = (age>18) ?(age > 25 ? "In goa you can drink" : "you can't drink"):"you can't go";
        System.out.println(result);
    }
}
