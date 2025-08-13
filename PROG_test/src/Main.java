import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String speed;


        System.out.println("Enter the person name:");
        name = scanner.nextLine();
        System.out.println("Enter the speed: ");
        speed= scanner.nextLine();
        System.out.println("***************************************");

        System.out.println("Name: "+name);
        System.out.println("Speed: "+ speed);
        System.out.println("Fine PAYABLE: " + SpeedingFines.printFines());
        System.out.println("***************************************");
    }
}