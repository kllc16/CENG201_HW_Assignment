public class HospitalSystemTest {
    public static void main(String[] args) {

        HospitalSystem HSystem = new HospitalSystem();

        Patient p1 = new Patient("Kerem", 3, 20);
        Patient p2 = new Patient("Ali", 1, 12);
        Patient p3 = new Patient("Metin", 2, 32);
        Patient p4 = new Patient("Duygu", 3, 19);
        Patient p5 = new Patient("Micheal", 1, 45);
        Patient p6 = new Patient("Zekeria", 2, 66);
        Patient p7 = new Patient("Zülkarneyn", 1, 35);
        Patient p8 = new Patient("x ae a-12", 3, 3);
        Patient p9 = new Patient("Linus", 3, 55);
        Patient p10 = new Patient("Tayyip", 3, 71);


        HSystem.addPatient(p1);
        HSystem.addPatient(p2);
        HSystem.addPatient(p3);
        HSystem.addPatient(p4);
        HSystem.addPatient(p5);
        HSystem.addPatient(p6);
        HSystem.addPatient(p7);
        HSystem.addPatient(p8);
        HSystem.addPatient(p9);
        HSystem.addPatient(p10);

        HSystem.addTreatmentRequest(1,true);
        HSystem.addTreatmentRequest(3);
        HSystem.addTreatmentRequest(4,true);
        HSystem.addTreatmentRequest(5);
        HSystem.addTreatmentRequest(6);
        HSystem.addTreatmentRequest(7);
        HSystem.addTreatmentRequest(8);
        HSystem.addTreatmentRequest(9);


        HSystem.addDischargeRecord(10);
        HSystem.addDischargeRecord(2);

        HSystem.treatmentPriority();
        HSystem.treatmentPriority();
        HSystem.treatmentPriority();
        HSystem.treatmentPriority();

        HSystem.printCurrentSystemState();





    }
}
