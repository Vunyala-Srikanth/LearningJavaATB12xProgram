package ex_16_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Lab154_Array_User_Inputs {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("Enter the size of the array(int)");

        int size = st.nextInt();
        String []  number_of_marks = new String[size];
        for(int i=0;i<number_of_marks.length;i++){
            System.out.println("Enter the elements -> " + i);
            number_of_marks[i] = st.next();
            System.out.println(number_of_marks[i]);
        }
        System.out.println("print the values");
        for (String mark:number_of_marks){
            System.out.println(mark);
        }
st.close();

    }
}
