package EX_02_JavaBasics;

public class Lab26_LocalVariables {

        public static void main (String[]args){
            // Declaration and initialization of a local variable 'number'
            int number = 10;

            // Accessing the local variable within the main method
            System.out.println("The number is: " + number);

            // Calling a method that uses a local variable
            printMessage("Hello, World!");
           // System.out.println(message);
        }

        public  void printMessage (String sri){
            // 'message' is a local variable within the printMessage method


        }

    }

