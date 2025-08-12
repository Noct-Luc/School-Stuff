import java.util.ArrayList;
import java.util.Scanner;

public abstract class SeriesModel  {
    static ArrayList<SeriesModel> seriesList = new ArrayList<>();
    public String SeriesId;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;

    public SeriesModel(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {
        this.SeriesId = seriesId;
        this.SeriesName = seriesName;
        this.SeriesAge = seriesAge;
        this.SeriesNumberOfEpisodes = seriesNumberOfEpisodes;

    }

    public String getSeriesId() {
        return SeriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }




    public static void AgeRestriction() {
        Scanner scanner = new Scanner(System.in);
        int user = 0;
        while (true) {
            System.out.println("Enter the age restriction");
            user = scanner.nextInt();
            ;

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


}




