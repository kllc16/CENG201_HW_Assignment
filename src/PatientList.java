public class PatientList {
    private PatientNode head;

    PatientList() {
        this.head = null; //head will start empty in first
    }


    public void addPatient(Patient p) {
        PatientNode newPatient = new PatientNode(p);

        if (head == null) {//for empty patient list
            head = newPatient;
            System.out.println("--First Patient Successfully Added--");
        } else {
            PatientNode listTraveller = head;//i create a temporary traveller to go end
            while (listTraveller.next != null) {
                listTraveller = listTraveller.next;//sliding all the way to the end
            }
            listTraveller.next = newPatient;// fresh blood in the end
            System.out.println("--New Patient Successfully Added--");

        }
    }

    public void printList() {//printing infos

        if (head == null) {//precaution in case a blank list is printed
            System.out.println("!!Not Any Patient In The List!!");
            return;
        }

        PatientNode listTraveller = head;

        do {
            listTraveller.patient.giveInfo();//calling giveInfo() method for every patient
            listTraveller = listTraveller.next;
        } while (listTraveller.next != null);
        listTraveller.patient.giveInfo();

    }

    public void removePatient(int id) {
        boolean isDeleted = false;//creating flak for invalid id check


        if (head == null) {
            isDeleted = true;
            System.out.println("!!Not Any Patient In The List!!");
        } else if (head.patient.id == id) {//removing first patient and printing infos of him
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("This patient has been deleted");
            System.out.println("-----------------------------");
            head.patient.giveInfo();
            head = head.next;

            isDeleted = true;
        } else {
            PatientNode listTraveller = head;
            PatientNode victim = null;//this will be the deleted node
            while (listTraveller.next != null) {
                if (listTraveller.next.patient.id == id) {
                    victim = listTraveller.next;

                    System.out.println();
                    System.out.println("-----------------------------");
                    System.out.println("This patient has been deleted");
                    System.out.println("-----------------------------");
                    victim.patient.giveInfo();//giving infos of deleted patient

                    listTraveller.next = victim.next;//we are cutting the ropes of victim :(

                    isDeleted = true;//making green the falk and breaking the loop for efficiency
                    break;

                }
                listTraveller = listTraveller.next;
            }
        }

        if (!isDeleted) {//warning message for invalid id
            System.out.println("!!!There is no patient with id " + id + " !!!");
        }
    }

    public Patient findPatient(int id) {

        if (head == null) {//checking list if empty
            System.out.println("!!Not Any Patient In The List!!");
            return null;
        } else {
            PatientNode listTraveller = head;
            while (listTraveller != null) {//travelling till end

                if (listTraveller.patient.id == id) {

                    return listTraveller.patient;//if id matches returning patient as asked
                }

                listTraveller = listTraveller.next;
            }
        }

        return null;//if invalid id entered it will return null
    }


}
