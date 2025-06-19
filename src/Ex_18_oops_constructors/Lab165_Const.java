package Ex_18_oops_constructors;

public class Lab165_Const {
    public static void main(String[] args) {
        Car2 def = new Car2();

        Car2 nano = new Car2("nano", 2020);
        {
            System.out.println(nano.model);
            System.out.println(nano.year);
        }
        Car2 innova = new Car2("innova", 2024);
        {
            System.out.println(innova.year);
            System.out.println(innova.model);
        }


    }}
