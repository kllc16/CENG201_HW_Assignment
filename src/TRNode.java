//       Treatment Request Node
public class TRNode {
    TreatmentRequest TRequest;
    TRNode next;

    public TRNode(TreatmentRequest TreatmentRequest) {
        this.TRequest = TreatmentRequest;
        this.next = null;
    }
}
