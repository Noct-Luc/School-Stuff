public abstract class Fine implements iFine {

    public String personName;
    public static int personSpeed;

    public Fine(String personName, String personSpeed){
        this.personName=personName;
        this.personSpeed= Integer.parseInt(personSpeed);
    }

    protected Fine() {
    }

    public String getPersonName() {
        return personName;
    }

    public String getPersonSpeed() {
        return String.valueOf(personSpeed);
    }
}
