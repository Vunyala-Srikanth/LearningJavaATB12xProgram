package EX_02_JavaBasics;

public class Lab24_Printf {
    public static void main(String[] args) {
        int a =10;
        //        System.out.println(a);
//        System.out.printf("Your variable is %d", a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b =20;
        // A format string as described in Format string syntax
        System.out.printf("a value is %d \n b value is %d \n",a,b);
        System.out.printf("your value is:%d\n b value is %d \n",a,b);
        System.out.println();
        System.out.printf("a value =%d \n b value=%d \n",a,b);

    }
}
