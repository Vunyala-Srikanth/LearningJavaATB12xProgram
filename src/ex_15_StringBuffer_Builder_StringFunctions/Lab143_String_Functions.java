package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Srikanth";
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        //System.out.println(name.charAt(10));// java.lang.StringIndexOutOfBoundsException: Index 10 ou
        //     // 2. concat()
        System.out.println(name.concat("varma"));
        // 3. contains()
        System.out.println(name.contains("sh"));
        // 4. equals()
        System.out.println(name.equals("sri"));
        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("SRI"));
        // 6. indexOf() //  srikanth -> ? i
        System.out.println(name.indexOf('r'));
        String s1 = "madam";
        System.out.println(s1.indexOf(3));
        // 8. replace( , )
        System.out.println(name.replace('n', 'N'));
        // 10. substring( , )
        System.out.println(name.substring(1, 3));
        // 11. touppercase()
        System.out.println("SRIKANTH".toUpperCase());
        //12 to lowercase
        System.out.println(name.toLowerCase());
        // 13. endsWith()
        System.out.println(name.endsWith("a"));
        //14  startswith()
        System.out.println(name.startsWith("s"));
        // 16. trim()
        String name3 = " sri ";
        System.out.println(name3.trim());
        // 17. compareTo()
        System.out.println(name.compareTo("sri"));

        StringBuilder stringBuilder = new StringBuilder("Sonal");
        System.out.println(stringBuilder);
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);


        String s11 = "Pramod";
        String s21 = s11.concat("Dutta");
        System.out.println(s21);



    }
}
