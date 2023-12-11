public class Student {
    private String name;
    private int ID;
    private String address;
    protected double GPA;
    private boolean enrollmentStatus;

    public Student(String name, int ID, String address, double GPA, boolean enrollmentStatus) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.GPA = GPA;
        this.enrollmentStatus = enrollmentStatus;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Address: " + address);
        System.out.println("GPA: " + GPA);
        System.out.println("Enrollment Status: " + (enrollmentStatus ? "Enrolled" : "Not Enrolled"));
    }
}

class Internship extends Student {
    private char FYPResult;

    public Internship(String name, int ID, String address, double GPA, boolean enrollmentStatus, char FYPResult) {
        super(name, ID, address, GPA, enrollmentStatus);
        this.FYPResult = FYPResult;
    }

    public char getFYPResult() {
        return FYPResult;
    }

    public String checkInternship() {
        if (GPA > 2.5 && FYPResult == 'P') {
            return "You have met the requirements to proceed to the internship.";
        } else {
            return "Cannot proceed to the internship.";
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("FYP Result: " + FYPResult);
        System.out.println("Internship Result: " + checkInternship());
    }
}

interface Printable {
    void printTitle(String facultyName);
}

class InternshipDemo implements Printable {
    @Override
    public void printTitle(String facultyName) {
        System.out.println("AHHHHHHHH " + facultyName + " faculty.");
    }

    public static void main(String[] args) {
        Internship[] students = new Internship[10];

        students[0] = new Internship("John Doe", 12345, "123 Main St", 3.7, true, 'P');
        students[1] = new Internship("Jane Smith", 12346, "456 Elm St", 3.9, true, 'F');
        students[2] = new Internship("James Johnson", 12347, "789 Oak St", 3.5, true, 'P');
        students[3] = new Internship("Emily Williams", 12348, "234 Pine St", 3.2, true, 'K');
        students[4] = new Internship("Michael Brown", 12349, "567 Maple St", 2.8, true, 'P');
        students[5] = new Internship("Ava Jones", 12350, "890 Cedar St", 3.1, true, 'F');
        students[6] = new Internship("William Wilson", 12351, "345 Birch St", 3.6, true, 'P');
        students[7] = new Internship("Olivia Miller", 12352, "678 Walnut St", 3.8, true, 'K');
        students[8] = new Internship("Benjamin Davis", 12353, "901 Ash St", 2.4, true, 'P');
        students[9] = new Internship("Sophia Garcia", 12354, "123 Cherry St", 2.9, true, 'F');

        InternshipDemo demo = new InternshipDemo();

        for (Internship student : students) {
            demo.printTitle("FCI");
            student.displayInfo();
            System.out.println();
        }
    }
}