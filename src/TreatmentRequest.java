public class TreatmentRequest {
    private static int idBox;//using static for uniqueness

    int patientID;
    long arrivalTime;

    public TreatmentRequest() {
        idBox++;//i prefer an automatic assignment system as i did in task1
        this.patientID = idBox;

        this.arrivalTime = System.currentTimeMillis();
    }
}
