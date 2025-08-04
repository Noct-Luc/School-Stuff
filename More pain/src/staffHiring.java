abstract class staffHiring extends Staff {

    public staffHiring(int staffNums, String location) {
        super(staffNums, location);
    }

    public static String PrintingStaffHiring() {

        System.out.println("Staff hiring report");
        System.out.println("-----------------------");
        System.out.println("Location: " + staffNums);
        System.out.println("Hire staff?");
        if (staffNums < 20) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        return "";
    }

    @Override
    public String getStaffHiringProcess() {
        return "";
    }
}