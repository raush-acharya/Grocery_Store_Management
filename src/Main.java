import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Grocery Store Management System");
        Scanner scanner = new Scanner(System.in);
        int continue_input;
        do {
            System.out.println("Please type the corresponding number to select one of the following options." );
            System.out.println("1: Add items to inventory");
            System.out.println("2: View inventory");
            System.out.println("3: Sales Page");
            System.out.println("4: Exit");

            continue_input = scanner.nextInt();

            switch (continue_input){
                case 1:
//                    add items to inventory
                    break;
                case 2:
//                    view inventory
                    break;
                case 3:
//                    Sales page
                case 4:
                    System.out.println("Thank you for using Grocery Store Management System");
            }
        }while (continue_input != 4);
    }
}