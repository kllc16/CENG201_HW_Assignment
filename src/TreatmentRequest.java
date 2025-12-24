import java.text.SimpleDateFormat;
import java.util.Date;

public class TreatmentRequest {

    int patientID;
    long arrivalTime;
    boolean isPriority;//checking for priority

    public TreatmentRequest(int patientID) {
        this.patientID = patientID;
        this.arrivalTime = System.currentTimeMillis();

        this.isPriority = false;//if not priority no need to enter anything else
    }

    public TreatmentRequest(int patientID,boolean isPriority) {//i prefer overload because only enter true if you have priority
        this.patientID = patientID;

        this.arrivalTime = System.currentTimeMillis();

        this.isPriority = isPriority;
    }

    @Override
    public String toString() {//for a better looking printing format
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeStr = sdf.format(new Date(arrivalTime));

        return String.format("PatientID:%d Arrived:%s", patientID, timeStr);
    }
}
