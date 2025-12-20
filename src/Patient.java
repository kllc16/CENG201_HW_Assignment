public class Patient {
    private static int idBox;//using static for uniqueness

    //implemented wanted attributes
    int id;
    String name;
    int severity;
    int age;

    PatientNode head;

    //then created its constructor
    public Patient(String name, int severity, int age) {
        idBox++;//i prefer an automatic assignment system because i do not want any errors or confusion in the id section
        this.id = idBox;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    //this will help to print every info about patients
    public void giveInfo() {
        System.out.println("-----------------------------");
        System.out.println("Patient ID:       "+ id);
        System.out.println("Patient Name:     "+ name);
        System.out.println("Patient Severity: "+ severity);
        System.out.println("Patient Age:      "+ age);
        System.out.println("-----------------------------");
        System.out.println();
    }

    //i have added this for test to findPatient()
//    @Override
//    public String toString() {
//        return String.format("Patient[ID=%d, Name=%s, Severity=%d, Age=%d]",
//                id, name, severity, age);
//    }
}
