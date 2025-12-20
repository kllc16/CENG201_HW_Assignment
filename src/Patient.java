public class Patient {
    private static int idBox;

    //implemented wanted attributes
    int id;
    String name;
    int severity;
    int age;

    PatientNode head;

    //then created its constructor
    public Patient(String name, int severity, int age) {
        idBox++;//i prefer an automatic assignment system because i donot want any errors or confusion in the id section
        this.id = idBox;
        this.name = name;
        this.severity = severity;
        this.age = age;
    }

    //this will help to print ever info about patients
    public void giveInfo() {
        System.out.println("---------------------------");
        System.out.println("Patient ID:       "+ id);
        System.out.println("Patient Name:     "+ name);
        System.out.println("Patient Severity: "+ severity);
        System.out.println("Patient Age:      "+ age);
        System.out.println("---------------------------");
    }
}
