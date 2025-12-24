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

    public void addTreatmentRequest(int patientId) {//it is fake method, if no extra priority input returns isPriority false
        addTreatmentRequest(patientId, false);
    }

    public void addTreatmentRequest(int patientID, boolean isPriority) {//Main method of overload
        if (patientHashMap.containsKey(patientID) == false) {//checking if patient is existing
            System.out.println("!!No Patient With ID: " + patientID + " !!");
            return;//if no breaking method
        }

        TreatmentRequest request = new TreatmentRequest(patientID, isPriority);

        if (isPriority) {//if priority true, patient goes to priorityQueue
            priorityQueue.enQueue(request);
            System.out.println("--Patient With ID: " + patientID + " Added To Priority Queue--");
        } else {//if priority false, patient goes to normalQueue
            normalQueue.enQueue(request);
            System.out.println("--Patient With ID: " + patientID + " Added To Normal Queue--");
        }
    }

    public void treatmentPriority() {
        TreatmentRequest inTRequest = null;//This will be the node of the patient to be treated

        if (priorityQueue.size() > 0) {//We take a priority patient if exist
            inTRequest = priorityQueue.deQueue();//taking information to temp and removing from queue
            System.out.println("--Patient With ID:" + inTRequest.patientID + " In Treatment--");
        } else if (normalQueue.size() > 0) {//then check for a normal patient
            inTRequest = normalQueue.deQueue();
            System.out.println("--Patient With ID:" + inTRequest.patientID + " In Treatment--");
        } else {//if these two empty so there is no more
            System.out.println("--None Patient Waiting For Treatment--");
            return;
        }

        //Finding patient in hashMap
        Patient inDocPatient = patientHashMap.get(inTRequest.patientID);
        //PRinting his inforamtions
        System.out.println();
        System.out.println("Patient ID: " + inDocPatient.id + ", Name: " + inDocPatient.name + ", Age: " + inDocPatient.age + ", Severity: " + inDocPatient.severity);

        //Creating Discharge Record
        DischargeRecord dRecord = new DischargeRecord(inTRequest.patientID);
        dischargeStack.push(dRecord);//then pushing into the stack
        System.out.println("Patient's Treatment Is Complete And He Has Been Discharged");
        System.out.println();


    }


}
