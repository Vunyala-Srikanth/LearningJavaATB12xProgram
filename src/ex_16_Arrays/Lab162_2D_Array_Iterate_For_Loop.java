package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{3,4,5},{5,6,7}};
       // 3X3
        // R->3
        //c->3
        //1,2,3
        //4,5,6
        //7,8,9

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++)
            System.out.print(matrix[i][j]+"\t");
            System.out.println();
        }
    }

}
