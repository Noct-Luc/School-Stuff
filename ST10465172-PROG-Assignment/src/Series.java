import java.util.Scanner;


public class Series extends SeriesModel{
    public Series( String SeriesId, String SeriesName, String SeriesAge, String SeriesNumberOfEpisodes){
        super(SeriesId,  SeriesName, SeriesAge, SeriesNumberOfEpisodes);
    }
    public static String captureSeries(){
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


}
