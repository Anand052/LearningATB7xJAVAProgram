package ex_29012025;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code.
        // Chrome -> start chrome, firefox -> start firefox, edge -> start edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the Chrome browser");
//                Webdriver driver = new Chrome();
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
//                Webdriver driver = new Firefox();
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
//                Webdriver driver = new Edge();
                break;
            default:
                System.out.println("I don't have idea what is this??");
        }

    }
}
