import java.util.ArrayList;
import java.util.Scanner;
public class Add_items {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<String>();
    static ArrayList<Integer> quantity = new ArrayList<Integer>();
    static ArrayList<Double> price = new ArrayList<Double>();
    public static void Add_items() {
        String user_input = "";
        int i = 0;

        while(user_input != "N") {
            int j=i+1;
            System.out.println("Enter Name of Item "+ j );
            items.add(scanner.nextLine());
            System.out.println("Enter How many "+ items.get(i) + "you want to add");
            quantity.add(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter the price per unit of "+items.get(i));
            price.add(scanner.nextDouble());
            scanner.nextLine();
            i+=1;
            System.out.println("Do you want to add more? (Y/N)");
            user_input = scanner.nextLine();
            if ("N".equalsIgnoreCase(user_input)) {
                break;}
        }

    }

    public static String Send_items(int i) {
        return items.get(i);
    }
    public static int Send_quantity(int i) {
        return quantity.get(i);
    }
    public static double Send_price(int i) {
        return price.get(i);
    }

    public static int Number_of_items() {
        return items.size();
    }
}
