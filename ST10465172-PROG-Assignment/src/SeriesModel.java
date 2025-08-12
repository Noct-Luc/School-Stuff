import java.util.ArrayList;
import java.util.Scanner;

public abstract class SeriesModel  {

    public String SeriesId;
    public String SeriesName;
    public String SeriesAge;
    public String SeriesNumberOfEpisodes;
    ArrayList <String> Model =new ArrayList<String >();
    public SeriesModel(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {
    }

    public String getSeriesId() {
        return SeriesId;
    }

    public void setSeriesId(String seriesId) {
        SeriesId = seriesId;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(String seriesName) {
        SeriesName = seriesName;
    }

    public String getSeriesAge() {
        return SeriesAge;
    }

    public void setSeriesAge(String seriesAge) {
        SeriesAge = seriesAge;
    }

    public String getSeriesNumberOfEpisodes() {
        return SeriesNumberOfEpisodes;
    }

    public void setSeriesNumberOfEpisodes(String seriesNumberOfEpisodes) {
        SeriesNumberOfEpisodes = seriesNumberOfEpisodes;
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




