

public class SpeedingFines extends Fine {
    public SpeedingFines(String personName, int personSpeed) {
        super(personName, String.valueOf(personSpeed));
    }

    public static int printFines() {
//bug where it doesn't run the calculation and outputs the else statement first. I am disappointed in myself for not getting it
      double payableFine;

        if (personSpeed >= 120) {

            payableFine = (personSpeed * 10.20);
            System.out.println(payableFine);
        } else {
            System.out.println("No fine");
        }
        return personSpeed;
    }

    @Override
    public void iFine() {

    }
}
