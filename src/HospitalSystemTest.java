public class HospitalSystemTest {
    public static void main(String[] args) {

        HospitalSystem HSystem = new HospitalSystem();

        Patient p1 = new Patient("Kerem", 3, 20);
        Patient p2 = new Patient("Ali", 1, 12);
        Patient p3 = new Patient("Metin", 2, 32);
        Patient p4 = new Patient("Duygu", 3, 19);


        HSystem.addPatient(p1);
        HSystem.addPatient(p2);
        HSystem.addPatient(p3);
        HSystem.addPatient(p4);

        HSystem.addTreatmentRequest(1,true);
        HSystem.addTreatmentRequest(2);
        HSystem.addTreatmentRequest(3,false);
        HSystem.addTreatmentRequest(4,true);

        HSystem.treatmentPriority();
        



        HSystem.printCurrentSystemState();



    }
}
