import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] students = new int[3][3];

        for (int i = 0; i <= students.length - 1; i++) {

            System.out.println("Enter 9 numbers");

            {
                for (int o = 0; i <= students.length - i - 1; o++) {
                    students[o] = new int[]{scanner.nextInt()};

                }
            }
            System.out.println("Numbers are:" + Arrays.toString(students));
        }
    }
}