import java.util.Scanner;
// this program tells the user what vehicle the qualify to use on the trip
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityLocation;
        int touristNum;

        System.out.println("enter the location that you would like to tour");
        cityLocation = scanner.nextLine();
        System.out.println("enter number of tourist going on the trip");
        touristNum = Integer.parseInt(scanner.nextLine());

        TouristsVisit TouristsVisit = new TouristsVisit(touristNum, cityLocation);
        System.out.println("Tour number: "+ touristNum);
        System.out.println("Tour Location: "+ cityLocation);
        System.out.println("You qualify for the: "+ TouristsVisit.tourVehicle(touristNum,cityLocation)











        );
    }
}