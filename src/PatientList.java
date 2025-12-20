public class PatientList {
    private PatientNode head;

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
            System.out.println("--New Patient Successfully Added--");

        }
    }

    public void printList() {//printing infos
        PatientNode listTraveller = head;

        do {
            listTraveller.patient.giveInfo();//calling giveInfo() method for every patient
            listTraveller = listTraveller.next;
        } while (listTraveller.next != null);
        listTraveller.patient.giveInfo();

    }
}
