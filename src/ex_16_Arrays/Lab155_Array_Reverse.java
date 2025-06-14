package ex_16_Arrays;

public class Lab155_Array_Reverse {
    public static void main(String[] args) {
        int[] numbers = {33, 44, 55, 66, 78};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}