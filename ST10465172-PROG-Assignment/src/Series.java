import java.util.Scanner;


public class Series extends SeriesModel{
    public Series( String SeriesId, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes){
        super(SeriesId,  SeriesName, SeriesAge, SeriesNumberOfEpisodes);
    }


    public static String captureSeries(){ // does not save multiple series
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;
        String age;
        String episodeNum = "";

        System.out.println("Enter the series ID");
        id = scanner.nextLine();
        System.out.println("Enter the series name");
        name= scanner.nextLine();
        System.out.println("Enter the series age restriction");
        age = scanner.nextLine();
        System.out.println("Enter the series number of episodeNum");
        episodeNum = scanner.nextLine();
        Series newSeries = new Series( id, name, age,episodeNum );
        seriesList.add(newSeries);
        System.out.println("Series successfully stored.");
        return id;
    };
    public static void searchSeries(){ // this method was obtained through chatGPT.

        for (SeriesModel s : seriesList) {
            boolean foundIt = false;
            if (s.getSeriesId().equalsIgnoreCase(SeriesId)) {
                System.out.println("Series Found:");
                System.out.println("ID: " + s.getSeriesId());
                System.out.println("Name: " + s.getSeriesName());
                System.out.println("Age Restriction: " + s.getSeriesAge());
                System.out.println("Number of Episodes: " + s.getSeriesNumberOfEpisodes());
                foundIt = true;
                break;
            }
        }

    }




    public static void AgeRestriction() {
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        while (true) {
            System.out.println("Enter the age restriction");
            user = scanner.nextInt();
            if (user > 18) {
                System.out.println(" You have entered the wrong age restriction");
                System.out.println("Please reenter the age restriction");
            } else if (user <= 2) {
                System.out.println(" You have entered the wrong age restriction");
                System.out.println("Please reenter the age restriction");
            } else {
                System.out.println("Age restriction updated");
                return;
            }

        }
    }

    public static void displaySeries() { // works fine
        System.out.println("Id: " + SeriesId);
        System.out.println("Name: " + SeriesName);
        System.out.println("Age: " + SeriesAge);
        System.out.println("Episodes: " + SeriesNumberOfEpisodes);
        System.out.println("----------------------------");
    }
}

