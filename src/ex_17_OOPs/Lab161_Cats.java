package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {
cat ct1 = new cat();
cat ct2 = null;
new cat();

        ct1.running();
        ct2.running();

    }
}
class cat{
    String name;

    void running(){
        System.out.println("the running cat");
    }
}