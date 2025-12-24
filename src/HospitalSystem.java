import java.util.HashMap;

public class HospitalSystem {
    private PatientList patientList;
    private TreatmentQueue normalQueue;
    private TreatmentQueue priorityQueue;
    private DischargeStack dischargeStack;
    private HashMap<Integer, Patient> patientHashMap;

    public HospitalSystem() {
        this.patientList = new PatientList();
        this.normalQueue = new TreatmentQueue();
        this.priorityQueue = new TreatmentQueue();
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

    public Patient findPatient(int id) {//in Hashmap finding much faster than findPatient in patientList [O(1)]
        Patient patient = patientHashMap.get(id);

        if (patient == null) {//giving massage if there is no patient
            System.out.println("!!No Patient With ID: " + id + " !!");
            return null;
        } else {
            return patient;
        }
    }

    public void addTreatmentRequest(int patientId) {//it is fake method if no extra priority input returns false
        addTreatmentRequest(patientId, false);
    }

    public void addTreatmentRequest(int patientID, boolean isPriority) {//Main method of overload
        if (patientHashMap.containsKey(patientID) == false) {//checking if patient is existing
            System.out.println("!!No Patient With ID: " + patientID + " !!");
            return;//if no breaking method
        }

        TreatmentRequest request = new TreatmentRequest(patientID, isPriority);

        if (!isPriority) {//if priority true, patient goes to priorityQueue
            priorityQueue.enQueue(request);
            System.out.println("--Patient With ID: " + patientID + " Added To Normal Queue--");
        } else {//if priority false, patient goes to normalQueue
            normalQueue.enQueue(request);
            System.out.println("--Patient With ID: " + patientID + " Added To Priority Queue--");
        }
    }


}
