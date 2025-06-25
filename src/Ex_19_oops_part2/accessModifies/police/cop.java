package Ex_19_oops_part2.accessModifies.police;

public class cop {
    private int gun;
    String idcard;


    public  cop(int gun) {
        this.gun=gun;
    }

    protected  void canishoot(){
        System.out.println("Yes You can shoot!\"");
    }
    //private void defaultfunction(){

    }

