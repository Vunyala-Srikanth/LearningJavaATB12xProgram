package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        int [] array ={6,7,9,55,77,43,44,55};
        int max =array[0];

        for(int i =0; i<array.length;i++){
            if(array[i] > max){
                max=array[i];
            }
        }
        System.out.println("Max is, " + max);
    }
}
