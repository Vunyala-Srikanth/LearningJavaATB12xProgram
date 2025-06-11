package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0="Srikanth";
        String s1="srikanth";

        StringBuilder builder = new StringBuilder("sri");
        StringBuffer  buffer = new StringBuffer("srikanth");
        System.out.println(builder);
        System.out.println(buffer);
        System.out.println(builder.reverse());
        System.out.println(buffer.reverse());

    }
}
