import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue treatmentQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientHashMap;

    public HospitalSystem(PatientList patientList, TreatmentQueue treatmentQueue, DischargeStack dischargeStack, HashMap<Integer, Patient> patientHashMap) {
        this.patientList = new PatientList();
        this.treatmentQueue = new TreatmentQueue();
        this.dischargeStack = new DischargeStack();
        this.patientHashMap = new HashMap<>();
    }
}
