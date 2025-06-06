package Task;

public class String_reverse {
    public static void main(String[] args) {
        String name = "Srikanth";
        int len = name.length();  //length =8 1to8
       // System.out.println(len);
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev=rev+name.charAt(i);   // char at (i) =7 its start from 0
           // System.out.println(rev);

        }
        System.out.println(rev);
    }
}
