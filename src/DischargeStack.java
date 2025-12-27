public class DischargeStack {
    private DSNode top;
    private int size;

    public DischargeStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(DischargeRecord dr) {
        DSNode newDRecord = new DSNode(dr);
        System.out.println("--New Discharge Record Added--");
        newDRecord.next = top;//new nodes next points to old top

        top = newDRecord;//making new discharge record the top

        size++;
    }

    public DischargeRecord pop() {
        if (top == null) {//returning null for empty stack
            System.out.println("!!No Discharge Record!!");
            return null;
        } else {//giving addition massage and returning
            System.out.println("--Discharge Records of Patient With ID: " + top.dRecord.patientId + " Has Been Deleted--");
            DischargeRecord victim = top.dRecord;//saving it to return later
            top = top.next;//deletion of top
            size--;
            return victim;
        }
    }

    public void peek() {
        if (top == null) {
            System.out.println("!!No Discharge Record!!");
        } else {
            System.out.println("--Last Discharge Record -> "+top.dRecord+"--");//if not empty returning the top node
        }
    }

    public void printStack() {
        if (top == null) {
            System.out.println("!!No Discharge Record!!");
        } else {
            DSNode traveller = top;


            System.out.print("Head of Stack <- ");
            while (traveller.next != null) {
                System.out.print(traveller.dRecord + " <- ");
                traveller = traveller.next;
            }
            System.out.print(traveller.dRecord + " <- End");
        }
    }

    public int size() {
        return size;
    }//returning size



}
