public class TreatmentQueue {
    private TRNode front; //head of the queue
    private TRNode rear; //last element of the list
    private int size;//size of queue

    public TreatmentQueue() {//constructor
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enQueue(TreatmentRequest request) {//adding operation
        TRNode inQueReq = new TRNode(request);

        if (rear == null) {//for empty list making first node
            front = inQueReq;
            rear = inQueReq;
        } else {//if not empty
            rear.next = inQueReq;
            rear = inQueReq;//switching rear to new node
        }size++;//increasing size
        //giving massage for addition
        System.out.println("--Patient with ID:" + inQueReq.TRequest.patientID + " has added--");

    }

    public TreatmentRequest deQueue() {//extraction operation
        if (front == null) {
            System.out.println("!!No Treatment Request In Queue!!");//if queue is empty returns null
            return null;
        }

        TreatmentRequest inTurnReq = front.TRequest;//Storing the data that we need
        System.out.println("--Patient with ID:" + inTurnReq.patientID + " came out of the queue--");

        front = front.next;//deleting the node
        size--;//decreasing the size

        if (front == null) {
            rear = null;//if deleted node was the last one, making rear null and giving massage
            System.out.println("--There are no more patients left in line--");
        }

        return inTurnReq;//returning wanted data
    }

    public int size() {
        return size;//returns the size
    }

    public void printQueue() {
        if (size == 0) {//if queue is empty gives massage
            System.out.println("!!No Treatment Request In Queue!!");
        } else {
            TRNode queTraveller = front;// if not empty traveller will travel entire queue and will print

            System.out.print("Head of Queue <- ");
            while (queTraveller != null) {
                System.out.print(queTraveller.TRequest + " <- ");
                queTraveller = queTraveller.next;//passing the next request
            }
            System.out.print(" Tail of Queue");
            System.out.println();
        }
    }
}
