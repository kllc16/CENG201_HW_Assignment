public class PatientNode {
    Patient patient; //main data
    PatientNode next; //next reference

    public PatientNode(Patient patient) {
        this.patient = patient;
        this.next = null;
    }
}
