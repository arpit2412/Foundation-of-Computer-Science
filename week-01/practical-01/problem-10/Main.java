/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/


public class Main{
	public static void main(String [] args){

		//Rearranging the code to get the expected output

		//Creating Variables
		int agent_id = 007;
		String agent_message_01282 = "Who are you?";
		
		//Displaying		
		System.out.println(agent_message_01282);
		
		
		agent_message_01282 = "My name is, Bond...";
		System.out.println(agent_message_01282);
		
		agent_message_01282 = "James Bond";
		System.out.println(agent_message_01282);

		// Agent_Message + Agent_Id
		agent_message_01282 = agent_message_01282 + "(00" + agent_id + ")";
		System.out.println(agent_message_01282);
	}
}
