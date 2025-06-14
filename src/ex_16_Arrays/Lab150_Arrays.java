package ex_16_Arrays;

public class Lab150_Arrays {
    public static void main(String[] args) {
        int[] marks={99,98,77,66,76,55};
        // 2nd way to create the array
        int [] marks2= new int[5];
        int [] marks3= new int[5]; // Fixed Size

        String[] names = new String[3];
        names[0]="sri";
        names[1]= "varma";
        names[2]= "java";
        System.out.println(names[0]);
        System.out.println(names[2]);

        System.out.println(marks[1]);
    }
}
