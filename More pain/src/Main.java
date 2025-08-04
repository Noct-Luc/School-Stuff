import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the store location:");
        String location = scanner.nextLine();

        System.out.println("Enter the current number of staff:");
        int staffNum = scanner.nextInt();


        staffHiring sh = new staffHiring(staffNum, location) {
            @Override
            public int staffNums() {
                return 0;
            }

            @Override
            public String location() {
                return "";
            }

            @Override
            public String getStaffHiringProcess() {

                return "";
            }
        };

        staffHiring.PrintingStaffHiring();


        scanner.close();
    }
}