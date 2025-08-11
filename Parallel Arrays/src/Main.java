import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 3;
        String[] ITEMS = {"Pencil", "Rubber", "Paintbrush"};
        String foundIt, item, price = "";
        int[] PRICES = {3, 5, 10};
        int sub = 0;

        System.out.println("Enter item to search for:" + Arrays.toString(ITEMS));
        item = scanner.next();
        foundIt = "N";

        while (sub < size) {
            if (item.equals(ITEMS[sub])) {
                foundIt = "Y";
                price = String.valueOf(PRICES[sub]);
            }
            sub++;
            if (foundIt.equals("Y")) {
                System.out.println("price is:" + price);
            } else {
                System.out.println("Item not found");
            }
        }
    }
}

