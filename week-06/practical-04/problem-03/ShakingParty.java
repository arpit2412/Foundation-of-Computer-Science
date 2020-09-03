/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
import java.util.*;
class ShakingParty{
	private int nPeople = 0;

	//Basic constructor
	ShakingParty(){
		Random rand = new Random();
		this.nPeople = rand.nextInt(5);				//Generate random number of peoples between 0 to 9
	}

	//Parameterised Constructor
	ShakingParty(int nTmp){
		this();											//Calling basic constructor
		this.nPeople = this.nPeople + nTmp;				//Adding number of temporary people
	}

	//Count handshakes
	public int countHandShakes(int nPeople){
		if (nPeople == 0){
			return 0;
		}else{
			return (nPeople - 1) + countHandShakes(nPeople - 1);  				//direct formula (n*(n-1))/2 without recursion
		}
	}

	//Accessor
	public int getPeople(){
		return this.nPeople;
	}

	//Mutators
	public void setPeople(int nPeople){
		this.nPeople = nPeople;
	}
	
}