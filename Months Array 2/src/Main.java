import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] months = new String[12];
        for (int o = 0; o <= months.length-1; o++ ) {
            System.out.println("enter 12 months");
            months = new String[]{scanner.nextLine()};
        }
        System.out.println("the months are:" + Arrays.toString(months));
    }
}