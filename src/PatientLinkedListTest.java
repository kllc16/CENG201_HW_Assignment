public class PatientLinkedListTest {
    public static void main(String[] args) {
        PatientList p = new PatientList();
        Patient p1 = new Patient("Yusuf",3,20);
        Patient p2 = new Patient("Ali", 2, 19);
        Patient p3 = new Patient("Veli", 1, 56);
        Patient p4 = new Patient("Deli", 2, 31);
        Patient p5 = new Patient("Melih", 1, 56);

        p.addPatient(p1);
        p.addPatient(p2);
        p.addPatient(p3);
        p.addPatient(p4);
        p.addPatient(p5);

        p.removePatient(3);

        p.findPatient(4);

        p.printList();

    }
}
