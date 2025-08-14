public class TouristsVisit extends Tour {


    public String tourMessage;

    public TouristsVisit(int tourNum, String tourLocate) {
        super(tourNum, tourLocate);
    }
    public String tourVehicle(int tourNum, String tourLocate){
        if( tourNum < 24){
            tourMessage = "Single deck bus";
        } else {
            tourMessage = " Double deck bus";
        }
        return tourMessage;
    }


    @Override
    public int getTourNumber() {
        return tourNum;
    }

    @Override
    public String getTourLocation() {
        return tourLocate;
    }

    @Override
    public String getTouristsProcess() {
        return tourMessage;
    }
}
