import java.text.SimpleDateFormat;
import java.util.Date;

public class DischargeRecord {
    private static int idBox;//id generator

    int patientId;
    long dischargeTime;

    public DischargeRecord() {
        idBox++;//i prefer an automatic assignment system again
        this.patientId = idBox;

        this.dischargeTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {//for a better looking printing format
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String timeStr = sdf.format(new Date(dischargeTime));//same method in task2

        return String.format("PatientID:%d Arrived[%s]", patientId, timeStr);
    }
}
