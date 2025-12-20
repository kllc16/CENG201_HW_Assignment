public class PatientList {
    PatientNode head;

    PatientList() {
        this.head = null; //head will start empty in first
    }


    public void addPatient(Patient p) {
        PatientNode newPatient = new PatientNode(p);

        if (head == null) {// for empty patient list
            head = newPatient;
            System.out.println("--First Patient Successfully Added--");
        } else {
            PatientNode listTraveller = head;// i create a temporary traveller to go end
            while (listTraveller.next != null) {
                listTraveller = listTraveller.next;//sliding all the way to the end
            }
            listTraveller.next = newPatient;// fresh blood in the end
            System.out.println("--New Patient Successfully Added");

        }
    }
}
