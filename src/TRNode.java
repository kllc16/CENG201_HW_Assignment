//       Treatment Request Node
public class TRNode {
    TreatmentRequest TRequest;
    TRNode next;

    public TRNode(TreatmentRequest TRequest) {
        this.TRequest = TRequest;
        this.next = null;
    }
}
