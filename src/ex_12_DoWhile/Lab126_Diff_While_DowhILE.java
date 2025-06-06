package ex_12_DoWhile;

public class Lab126_Diff_While_DowhILE {
    public static void main(String[] args) {
        int a=0;
        while(a<0){
            System.out.println("while loop");
            a++;
        }
        do {
            System.out.println(a);//prints 0
            a++;
        }while(a<0);
        }
    }
