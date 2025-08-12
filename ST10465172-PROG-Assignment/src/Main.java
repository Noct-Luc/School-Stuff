import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int choice;
        int option = 0;



        System.out.println("LATEST SERIES - 2025");
        System.out.println("**************");
        System.out.println("Enter (1) to launch the menu or any other key to exit:");
        choice = Integer.parseInt(scanner.nextLine());

        while (running == true) {

            if (choice == 1) {
                System.out.println("Please select one of the following menu options (1-6)");
                System.out.println("1. Capture new series  (development in progress)");
                System.out.println("2. Search for a series (development in progress)");
                System.out.println("3. Update age restriction");
                System.out.println("4. Delete a series (development in progress)");
                System.out.println("5. Print Series report (development in progress)");
                System.out.println("6. Exit Application");

                option = Integer.parseInt(scanner.nextLine());

            } else {
                System.out.println("Quitting... Goodbye!");
                running = false;
            }

            switch (option) {

                case 1: //not done
                    System.out.println("Capturing new series" ) ;
                    Series. captureSeries();
                    break;

                case 2: //not done
                    System.out.println("Searching for a series ");
                    option = Integer.parseInt(scanner.nextLine());
                    break;

                case 3: //done
                    SeriesModel.AgeRestriction();
                    break;

                case 4: //not done
                    System.out.println("Delete a series");
                    option = Integer.parseInt(scanner.nextLine());
                    break;


                case 5: //not done
                    System.out.println("Print Series report");
                    option = Integer.parseInt(scanner.nextLine());
                    break;

                case 6: //done
                    System.out.println("Exit Application");
                    System.out.println("Quitting... Goodbye!");
                    running = false;

            }
        }
    }









}
