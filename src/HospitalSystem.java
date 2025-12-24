import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientHashMap;

    public HospitalSystem() {
        this.patientList = new PatientList();
        this.treatmentQueue = new TreatmentQueue();
        this.dischargeStack = new DischargeStack();
        this.patientHashMap = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        if (patient == null) {//patient information need to be fulled
            System.out.println("!!Empty Patient Information!!");
        } else if (patient.severity < 1 || patient.severity > 3) {
            System.out.println("!!Patient Severity Can Only Be Between 1-3!!");//checking for severity
        } else if (patient.age < 0) {
            System.out.println("!!Invalid Age Input!!");
        } else {//If all fine we are adding him
            patientList.addPatient(patient);//Adding to patient list
            patientHashMap.put(patient.id, patient);//Adding to Hashmap
            System.out.println("--Patient Successfully Added [Name: " + patient.name + ", ID: " + patient.id + ", Severity: " + patient.severity + "] --");
        }
    }
}
