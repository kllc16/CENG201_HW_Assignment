public class HospitalSystemTest {
    public static void main(String[] args) {

        HospitalSystem HSystem = new HospitalSystem();

        Patient p1 = new Patient("Kerem", 3, 20);
        PatientList pT = new PatientList();

        HSystem.addPatient(p1);



    }
}
