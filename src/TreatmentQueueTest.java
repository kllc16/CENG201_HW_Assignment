public class TreatmentQueueTest {
    public static void main(String[] args) {

        TreatmentQueue TQue = new TreatmentQueue();

        TreatmentRequest p1 = new TreatmentRequest();
        TreatmentRequest p2 = new TreatmentRequest();
        TreatmentRequest p3 = new TreatmentRequest();
        TreatmentRequest p4 = new TreatmentRequest();
        TreatmentRequest p5 = new TreatmentRequest();
        TreatmentRequest p6 = new TreatmentRequest();
        TreatmentRequest p7 = new TreatmentRequest();
        TreatmentRequest p8 = new TreatmentRequest();


        TQue.enQueue(p1);
        TQue.enQueue(p2);
        TQue.enQueue(p3);
        TQue.enQueue(p4);
        TQue.enQueue(p5);
        TQue.enQueue(p6);
        TQue.enQueue(p7);
        TQue.enQueue(p7);

        TQue.deQueue();
        TQue.deQueue();
        TQue.deQueue();

        //System.out.println(TQue.size());

        TQue.printQueue();

    }
}
