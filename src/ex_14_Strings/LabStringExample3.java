package ex_14_Strings;

public class LabStringExample3 {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s);
        String s1 = "JAVA".substring(1);
        System.out.println(s1);
        String s2 = "Java".substring(1, 3);
        System.out.println("s2 value" +" "+s2);
        char[] arr = "java".toCharArray();
        System.out.println(arr);
        String s3 =" java ";
        System.out.println(s3.trim());
        boolean b =" ".isBlank();
        System.out.println(b);
        String s4 = "ab".repeat(3);
        System.out.println(s4);
        boolean s7= "SRI".equalsIgnoreCase("sri");
        System.out.println(s7);

        String s111 = String.format("%s = %d", "age", 25);
        System.out.println(s111);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);

    }
}
