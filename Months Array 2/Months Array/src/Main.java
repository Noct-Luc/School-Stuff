import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Lux;
        int size = 12;

        String[] Months = {"January", "February", "March", "April", "May","June","July","August","September","October","November","December"};
        for (Lux = 0; Lux <= size - 1; Lux++) {
            System.out.println(Months[Lux]);

        }
    }
}