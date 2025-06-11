package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("sri");
        StringBuilder builder = new StringBuilder("srikanth");
        System.out.println(buffer.append("kanth"));
        System.out.println(builder.append("varma"));

        String s1 ="sri";
       s1=s1+"kanth";
        System.out.println(s1);
    }
}
