import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] colours = new String[5];

        for (int i=0; i<=colours.length-1;i++){

            System.out.println("Enter colours");
            colours[i] = scanner.nextLine();

        }
        System.out.println("Colours are" + Arrays.toString(colours));

    }
}