import java.text.SimpleDateFormat;
import java.util.Date;

public class TreatmentRequest {
    private static int idBox;//using static for uniqueness

    int patientID;
    long arrivalTime;

    public TreatmentRequest() {
        idBox++;//i prefer an automatic assignment system as i did in task1
        this.patientID = idBox;

        this.arrivalTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {//for a better looking printing format
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeStr = sdf.format(new Date(arrivalTime));

        return String.format("PatientID:%d Arrived:%s", patientID, timeStr);
    }
}
