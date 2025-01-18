package April.EX_25042024;

import java.util.Scanner;

public class Lab_51 {
    public static void main(String[] args) {
//        Web automaton
//        ask the browser , where u want to execute the code
//        chrome, firefox, edge
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name will tell you wwhere the execute");
        String browser_name = sc.next();
//        String browser_name = sc.nextLine();

        browser_name = browser_name.toLowerCase();
        switch (browser_name) {
               case "Chrome" :
                System.out.println("Execute the program in the chrome");
        break;
                case "Firewall" :
                    System.out.println("Execute the program in the Firewall");
                    break;
                    case "Edge" :
                        System.out.println("Execute the program in the Edge");
                        break;
        }

    }
}
