class StudentDetails {

    // Method 1 - Personal Details
    void address(String name, int rollNo, String instId) {
        System.out.println("---- Student Details ----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Institute ID: " + instId);
    }

    // Method 2 - College Details
    void address(String collegeName, String hostelName, int pinCode) {
        System.out.println("---- College Details ----");
        System.out.println("College Name: " + collegeName);
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Pin Code: " + pinCode);
    }

    public static void main(String[] args) {
        StudentDetails obj = new StudentDetails();
        obj.address("Sheetal Rawat", 101, "INST2026");

        System.out.println();
        obj.address("ABC College", "Ganga Hostel", 246149);
    }
}
