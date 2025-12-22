public class DischargeStackTest {
    public static void main(String[] args) {

        DischargeStack DRecord = new DischargeStack();

        DischargeRecord p1 = new DischargeRecord();
        DischargeRecord p2 = new DischargeRecord();
        DischargeRecord p3 = new DischargeRecord();
        DischargeRecord p4 = new DischargeRecord();
        DischargeRecord p5 = new DischargeRecord();


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
