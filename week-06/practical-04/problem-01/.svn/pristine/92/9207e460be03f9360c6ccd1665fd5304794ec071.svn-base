/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
class HanoiTower{
	private int nDisk;
	private String source = "Pole1";
	private String middle = "Pole2";
	private String destination = "Pole3"; 

	//Constructor
	HanoiTower(){
		this.setDisk(3);		//Setting number of disk to 3
	}

	//Parameterised constructor
	HanoiTower(int dTmp){
		this.setDisk(dTmp);			//setting number of disk to user input
	}

	//if someone wants to change the nname of the pole 
	public void  setName(String a, String b, String c){
		this.source = a;
		this.middle = b;
		this.destination = c;
	}

	//Accessors
	public String getSource(){
		return this.source;
	}
	public String getMiddle(){
		return this.middle;
	}
	public String getDestination(){
		return this.destination;
	}
	public int getDisk(){
	 	return nDisk;
	}

	//Mutators
	public void setDisk(int nDisk){
		this.nDisk = nDisk;
	}

	//method solve
	public void solve(){
		if(nDisk == 0){
			System.out.println("Zero Disk not possible!!");				//if disk is zero no movement
		}	
		move(nDisk, source, middle, destination);
	}
	
	//method move
	public void move(int disk, String source, String middle, String destination){
		if(disk == 0){
			return;
		}
		move(disk-1, source, destination, middle); 						//Recursion 
	    System.out.println("Move the disk " + disk +" from " + source + " to " + destination); 
	    move(disk-1, middle, source, destination);	        
	}
}