package Ex_18_oops_constructors;

public class Lab162_OOPs {
    public static void main(String[] args) {
Baby b = new Baby();
new  Baby();
Baby b2;
    }
}
class Baby{
    String name;
    // Default Constructor also called
    Baby(){
        System.out.println("I am called, because Object is created!");
    }


}