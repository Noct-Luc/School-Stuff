abstract class Staff implements iStaff {

        static int staffNums;
        String location;

        public Staff(int staffNums, String location) {
                Staff.staffNums = staffNums;
                this.location = location;
        }

        public String getLocation() {
                return location;
        }

        public int getStaffNums() {
                return staffNums;
        }
}