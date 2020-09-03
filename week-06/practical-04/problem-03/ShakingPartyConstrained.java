/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 
* name: Arpit Garg
*
*/
import java.util.*;
public class ShakingPartyConstrained extends ShakingParty
{
	private int nCouples;
	//Basic Constructor
	ShakingPartyConstrained()
	{
		Random rand = new Random();
		this.nCouples = rand.nextInt(5);		//generating randomm number of couples
		System.out.println("\n----------------------\n");
		System.out.println("Number of already decided couples at the Party: "+nCouples);

	}
	//Parametrized constructor
	ShakingPartyConstrained(int nTmp)
	{
		this();									//Calling basic constructor
		nCouples = nCouples + nTmp;				//adding new couples 
	}

	//Acessors
	public int getCouples()			
	{
		return this.nCouples;				
	}

	//Mutators
	public void setCouples(int nCouples){
		this.nCouples = nCouples;
	}
}