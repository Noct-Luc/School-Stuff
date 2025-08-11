import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Students = new int[10];

        for (int i=0; i<=Students.length-1;i++) {

            System.out.println("enter marks for 10 students");
            Students[i] = scanner.nextInt();

        }
        System.out.println("The Marks are:"+ Arrays.toString(Students));
        System.out.println("Even numbers are: ");
        for (int i=0; i<=Students.length-1;i++) {

            if (Students[i] % 2 == 0) {
                System.out.print(" " + Students[i]);
            }


        }



    }
}