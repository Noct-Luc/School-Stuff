import java.util.ArrayList;


public abstract class SeriesModel  {
    static ArrayList<SeriesModel> seriesList = new ArrayList<>();
    public static String SeriesId;
    public static String SeriesName;
    public static String SeriesAge;
    public static String SeriesNumberOfEpisodes;

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







}




