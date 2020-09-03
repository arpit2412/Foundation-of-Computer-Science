/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
public class ServiceCenter {
    private WaitingList awl;

    public ServiceCenter() {
        this.awl = new WaitingList();
    }

    /**
     * Record patient's data and add the patient into waiting list
     * @param name
     * @param phoneNumber
     * @param triageLevel
     * @param location
     */
    public void addPatientIntoList(String name, String phoneNumber, int triageLevel, String location) {
        Patient patient = new Patient(name, phoneNumber, triageLevel, location);
        if(this.awl.isInList(patient)){
            System.out.println(patient.getName() + " is in waiting list. ");
        }else{
            this.awl.addToList(patient);
            System.out.println("Add " + patient.getName() + " into waiting list. ");
        }
    }

    /**
     * Pop out the first patient in the waiting list and assign an Ambulance for him/her
     * @return the patient object
     */
    public void assignAmbulanceForPatient() {
        // TODO: The tester report that the system will crash when waiting list is empty

        Patient patient = this.awl.popPatient();
        
        if(patient != null){
            
            System.out.println("Assigned an ambulance for patient: " + patient.getName());
        
        }else{

            System.out.println("Error! The waiting list is empty.");
        }

    }


    public Patient assignAmbulanceForPatientById(String id){
        int count=0;
        if(awl.head!=null)
        {

            Node temp=this.awl.head;
            while(temp.getNext()!=null&&temp.getPatient().getId()!=Integer.parseInt(id))
            {    
                temp=temp.getNext();
                count++;
            }
            if(temp.getPatient().getId()==Integer.parseInt(id))
            {
                System.out.println("Success! An ambulance has been assigned for patient " + id);

            if(temp==this.awl.head)
            {
                return awl.popPatient();
            }
            //Finding the previous node
            else
            {
                temp=this.awl.head;
                for (int i=0; temp.getNext()!=null && i<count-1; i++) 
            
                {
                    temp=temp.getNext();
                }
                
            Node next;
            if(temp.getNext().getNext()!=null)
            {
                next=temp.getNext().getNext();
                
            }
            else
            {
                 next=null;
            }  
            temp.setNext(next);
            return this.awl.head.getPatient(); 
            }
            }
            else
            {
                System.out.println("No Patient with that ID");
                return null;
            }
        }
        else
        {
            System.out.println("No Patient with that ID");
            return null;
        }
    }


    //checkPositionById take patient's id and count and return the number of patient before them 
    public void checkPositionById(String id){
        if(awl.head == null){
            System.out.println("Waiting list is empty");
        }
        else if(awl.head.getPatient().getId() == (Integer.parseInt(id))){
            System.out.println("There is 0 patient before this id"+id);
        }
        else{
            Node tmp = awl.head;
            int counter = 1;
            while(tmp.getNext() != null && tmp.getNext().getPatient().getId() != (Integer.parseInt(id))){
                counter++;
                tmp = tmp.getNext();
            }
            if(tmp.getNext() == null){
                System.out.println("This Id doesn't exists");
                counter--;
            }
            if(counter == 1){
                System.out.println("There is "+counter+" patient before patient"+id);
            }
            else if(counter > 1){
                System.out.println("There is "+counter+" patient before patient"+id);
            }
        }
    }

    /**
     * Print out the waiting list
     */
    public void printWaitingList(){
        this.awl.printList();
    }
}
