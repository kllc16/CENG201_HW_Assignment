public class TreatmentQueueTest {
    public static void main(String[] args) {

        TreatmentQueue TQue = new TreatmentQueue();

        TreatmentRequest p1 = new TreatmentRequest(1);
        TreatmentRequest p2 = new TreatmentRequest(2);
        TreatmentRequest p3 = new TreatmentRequest(3);
        TreatmentRequest p4 = new TreatmentRequest(4);
        TreatmentRequest p5 = new TreatmentRequest(5);
        TreatmentRequest p6 = new TreatmentRequest(6);
        TreatmentRequest p7 = new TreatmentRequest(7);
        TreatmentRequest p8 = new TreatmentRequest(8);


        TQue.enQueue(p1);
        TQue.enQueue(p2);
        TQue.enQueue(p3);
        TQue.enQueue(p4);
        TQue.enQueue(p5);
        TQue.enQueue(p6);
        TQue.enQueue(p7);
        TQue.enQueue(p7);
        TQue.enQueue(p8);

        TQue.deQueue();
        TQue.deQueue();
        TQue.deQueue();

        //System.out.println(TQue.size());

        TQue.printQueue();

    }
}
