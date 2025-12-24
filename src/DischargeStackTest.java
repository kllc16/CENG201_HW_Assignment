public class DischargeStackTest {
    public static void main(String[] args) {

        DischargeStack DRecord = new DischargeStack();

        DischargeRecord p1 = new DischargeRecord(1);
        DischargeRecord p2 = new DischargeRecord(2);
        DischargeRecord p3 = new DischargeRecord(3);
        DischargeRecord p4 = new DischargeRecord(4);
        DischargeRecord p5 = new DischargeRecord(5);


        DRecord.push(p1);
        DRecord.push(p2);
        DRecord.push(p3);
        DRecord.push(p4);
        DRecord.push(p5);

        DRecord.pop();
        DRecord.pop();

        //DRecord.peek();

        DRecord.printStack();

    }
}
