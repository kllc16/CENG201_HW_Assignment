//    Discharge Stack Node
public class DSNode {
    DischargeRecord dRecord;
    DSNode next;//next node pointer

    public DSNode(DischargeRecord dRecord) {
        this.dRecord = dRecord;
        this.next = null;
    }
}
