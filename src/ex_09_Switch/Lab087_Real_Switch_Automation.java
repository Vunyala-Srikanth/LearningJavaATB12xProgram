package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {


        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        // use to I will start the automation in that browser.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser details");
        String browser = sc.next();
        browser  = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("..........");
                System.out.println("test case1");
                System.out.println("test case2");
                System.out.println("test case3");
                break;
            case "edge":
                System.out.println("Starting the edge");
                System.out.println("..........");
                System.out.println("test case1");
                System.out.println("test case2");
                System.out.println("test case3");
                break;

            case "safari":
                System.out.println("Starting the safari");
                System.out.println("..........");
                System.out.println("test case1");
                System.out.println("test case2");
                System.out.println("test case3");
                break;
            default:
                System.out.println("selected browser is not available");
                break;

        }


    }
}
