package multilevel;

public class Lab170_MultiLevel {
    public static void main(String[] args) {
son sa = new son();
sa.home();
sa.son();
Father fa = new Father();
Grandfather gf = new Grandfather();
//son s2 = new  Father();
        Father f2 = new son();//Dynamic dispatch
        Grandfather gf2 = new Father();
        Grandfather s3 = new son();


    }
}
