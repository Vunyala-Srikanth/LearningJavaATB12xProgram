package Ex_19_oops_part2.superkeyword;

public class Lab181 {
    public static void main(String[] args) {
        son sa = new son();
            }
}

class father{
    father(){
        System.out.println("Dc father con");
    }
    int gold = 10;
    void home(){
        System.out.println("Father home");
    }
}
class son extends father{
    son(){
        super();
    }
    void bike(){}
    void Home(){
        super.home();
        System.out.println(super.gold);
    }
}