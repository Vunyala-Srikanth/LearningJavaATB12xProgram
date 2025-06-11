package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("java");
       buffer.append(" programming");
        System.out.println(buffer);
         //     buffer.delete(5,16); // Delete the substring
      // System.out.println(buffer);
      buffer.replace(0, 4, "C++");
        System.out.println(buffer);

    }
}
