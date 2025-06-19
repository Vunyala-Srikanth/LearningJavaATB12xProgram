package Ex_18_oops_constructors;

public class Lab164_Car {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name="mg";
        tesla.year=2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);
        System.out.println();
        Car nano = new Car();
        nano.name="TATA NAno";
        System.out.println(nano.name);
        System.out.println(nano.year);
        System.out.println(nano.model);


        LoginPage l = new LoginPage();

    }
}
