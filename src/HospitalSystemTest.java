public class HospitalSystemTest {
    public static void main(String[] args) {

        HospitalSystem HSystem = new HospitalSystem();

        Patient p1 = new Patient("Kerem", 3, 20);


        HSystem.addPatient(p1);

        HSystem.addTreatmentRequest(1,true);



    }
}
