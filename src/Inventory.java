import java.util.Scanner;

public class Inventory {
    static Scanner scanner = new Scanner(System.in);
    public static void Inventory() {
        int Loop_count = Add_items.Number_of_items() - 1;
        int i;
        String item;
        int quantity;
        double price;
        double total;
        System.out.println("Your Inventory:");
        System.out.println("Sn.    Items       Price     Quantity      Total");
        for (i=0;i<=Loop_count;i++){
            item = Add_items.Send_items(i);
            quantity = Add_items.Send_quantity(i);
            price = Add_items.Send_price(i);
            total=quantity*price;
            System.out.println(i+1 +"      "+ item + "       Rs" + price + "      " + quantity+ "            "+total);
        }
        System.out.println("Press any key to continue.");
        scanner.nextLine();
    }


}
