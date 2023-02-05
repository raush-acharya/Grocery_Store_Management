import java.util.Scanner;

public class Sales_page {
    static int S_N;
    static String item;
    static int quantity;
    public static void Sales_page() {

        int input_listener;
        boolean loop_runner;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Sales Page");
        Inventory.Inventory();
        do{
            System.out.println("Enter the number corresponding to the item you want to buy.");
            S_N = scanner.nextInt();
            scanner.nextLine();
            item = Add_items.Send_items(S_N-1);
            System.out.println("How many "+ item +"s do you want to buy?");
            quantity =  scanner.nextInt();
            Add_items.change_quantity();
            System.out.println("Press 1 to continue shopping.");
            System.out.println("Press 2 to generate bill.");
            input_listener = scanner.nextInt();
            scanner.nextLine();

            switch (input_listener){
                case 1: loop_runner = true;
                break;
                case 2: loop_runner = false;
                break;
                default:
                    System.out.println("Please enter 1 to continue shopping or 2 to generate bill.");
                    loop_runner = true;

            }
        }while (loop_runner);
    }

    public static int user_selection() {
        return S_N-1;
    }
    public static int send_quantity() {
        return quantity;
    }
}
