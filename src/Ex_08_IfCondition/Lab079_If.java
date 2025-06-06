package Ex_08_IfCondition;

public class Lab079_If {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("Your elegible for vote");
        }
        else{
            System.out.println("Your not elegile for vote");
        }

    }
}
