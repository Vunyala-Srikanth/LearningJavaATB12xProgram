package ex_16_Arrays;

import java.sql.Array;
import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array {
    public static void main(String[] args) {
        int [] marks ={20,10,44,78,99,66};
        Arrays.sort(marks);
        for(int i= 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
