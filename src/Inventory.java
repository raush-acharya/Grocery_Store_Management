import java.util.Formatter;
public class Inventory {

    public static void Inventory() {

        Formatter formatter = new Formatter();

        int Loop_count = Add_items.Number_of_items() - 1;
        int i;
        String item;
        int quantity;
        double price;
        double total;
        System.out.println("Your Inventory:");
//        System.out.println("Sn.    Items       Price     Quantity      Total");
        formatter.format("%15s %15s %15s %15s %15s\n","Sn.","Items","Price","Quantity","Total");
        for (i=0;i<=Loop_count;i++){
            item = Add_items.Send_items(i);
            quantity = Add_items.Send_quantity(i);
            price = Add_items.Send_price(i);
            total=quantity*price;
            formatter.format("%15s %15s %15s %15s %15s\n",i+1,item,price,quantity,total);
//            System.out.println(i+1 +"      "+ item + "       Rs" + price + "      " + quantity+ "            "+total);
        }
        System.out.println(formatter);

    }


}
