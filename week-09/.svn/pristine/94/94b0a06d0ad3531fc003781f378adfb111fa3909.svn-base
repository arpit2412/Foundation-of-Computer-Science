/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
import java.lang.*;
public class WaitingList {
    protected Node head;
    protected int numNodes;

    public WaitingList(){
        this.head = null;
        this.numNodes = 0;
    }

    /**
     * This method will pop the first patient from the waiting list
     * @return the patient popped from the waiting list
     */
    public Patient popPatient() {

        if(this.head == null){
            
            return null;

        }else{

            Node tmp = this.head;
            this.head = this.head.getNext();
            tmp.setNext(null);
            numNodes--;
            
            return tmp.getPatient();
        }
    }



    public Patient popPatientById(int id){
        Node tmp;
        Patient removePatient;
        // if we are removing the node in between
        Node previousPatient = null;
        if(head == null){
            return null;
        }
        else{
            tmp = this.head;
            removePatient = tmp.getPatient();
            while(tmp.getNext()!= null && tmp.getPatient().getId() != id){
                    previousPatient = tmp; 
                tmp = tmp.getNext();
                removePatient = tmp.getPatient();
            }
            if(tmp.getPatient().getId() == id && previousPatient == null){
                head = tmp.getNext();
                numNodes--;
            }
            if(tmp.getPatient().getId() == id && previousPatient !=null){
                    previousPatient.setNext(tmp.getNext());
                numNodes--;
            }
            return removePatient;     
        }
    }


    /**
     * This method will add patient into the waiting list according to the triage level
     * @param patient patient's data
     */
    public void addToList(Patient patient) {

        Node nPatient = new Node(patient);

        if(this.head == null){

            this.head = nPatient;
            numNodes++;

        }else if(head.getPatient().getTriageLevel() < nPatient.getPatient().getTriageLevel()){

            nPatient.setNext(head);
            this.head = nPatient;  
        
        }else{

            Node tmp = this.head;
            int count = 0;

            while(tmp != null){
                    
                    if(tmp.getPatient().getTriageLevel() < nPatient.getPatient().getTriageLevel()){
                       
                        break;
                        
                    }else{

                        tmp = tmp.getNext();
                        count++;
                    }
                    
                }
            
            Node node = this.head;

            for(int j = 0; j < count - 1; j++){
            
                node = node.getNext();
            }

            nPatient.setNext(node.getNext());
            node.setNext(nPatient);
            numNodes++;
        }    
    }





    /**
     * print out the information for each patient in waiting list
     */
    public void printList() {

        if(this.head == null){

            System.out.println("Waiting list is empty");

        }else{

            Node tmp = this.head;
            
            while (tmp != null) {

                tmp.printNode();
                tmp = tmp.getNext();

            }
        }
    }

    /**
     * Check whether the patient is in this list or not
     * @return
     */
    public boolean isInList(Patient patient) {
        if (this.head == null) {
            return false;
        }
        Node temp = this.head;
        while(temp != null) {
            if(temp.getPatient().getName().equals(patient.getName())
                && temp.getPatient().getPhoneNumber().equals(patient.getPhoneNumber())){
                return true;
            }
        temp = temp.getNext();
        }
        return false;
    }
}
