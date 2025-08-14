public abstract class Tour implements iTour {
    public int tourNum;
    public String tourLocate;


    public Tour(int tourNum, String tourLocate) {
        this.tourNum = tourNum;
        this.tourLocate = tourLocate;
    }

    public void setTourLocate(String tourLocate, int tourNum) {
        this.tourLocate = tourLocate;
        this.tourNum = tourNum;
    }

    public int getTourNum() {
        return tourNum;
    }

    public String getTourLocate() {
        return tourLocate;
    }
}
