/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1784072 name: Arpit Garg
*
*/
//importing libraries
import java.util.*;
public class Main{
	//Main execution starts form here
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);		//input
			try{System.out.println("\n----------------------------\n");
			System.out.println("\nWelcome to Cycle Management Software!!!!\n");
			System.out.println("----------------------------");
			System.out.println("\n\nEnter \n1.Bicycle \n2.ElectricBike \n3.MountainBike \n4.RoadBike \n5.Hibrid\n\n");
			System.out.println("----------------------------");
			int n = input.nextInt();
			
			//Bicycle
			if(n == 1){		
				input.nextLine();
				System.out.println("\nEnter Color: ");
				String c = input.nextLine();
				System.out.println("\nEnter Year: ");
				int a = input.nextInt();
				System.out.println("\nEnter number of Gears: ");
				int g = input.nextInt();
				System.out.println("\nEnter if serviced (true/false): ");
				boolean s = input.nextBoolean();
				input.nextLine();
				System.out.println("\nEnter in Date: ");
				String in = input.nextLine();
				System.out.println("\nEnter out Date: ");
				String out = input.nextLine();
				System.out.println("\nEnter service responsible: ");
				String service = input.nextLine();
				System.out.println("\nEnter gear change");
				int gc = input.nextInt();
				Bicycle b = new Bicycle(c,a,g,s,in,out,service);				//Constructor
				b.get();
				b.setgearChange(gc);
				System.out.println("\n----------------------------\n");
				System.out.println("\nService status: " + b.getis_Serviced() + "\nIn Date: " + b.getinDate() + "\nOut Date: " + b.getoutDate() + "\nService responsible: " + b.getserviceResonsible());
				b.checkoutService();
				System.out.println("\nGear Change: " + b.changeGear());
				b.checkBrakes();
			}else if(n == 2){										//ElectricBike
				input.nextLine();
				System.out.println("\nEnter Color: ");
				String c = input.nextLine();
				System.out.println("\nEnter Year: ");
				int a = input.nextInt();
				System.out.println("\nEnter number of Gears: ");
				int g = input.nextInt();
				System.out.println("\nEnter if serviced (true/false): ");
				boolean s = input.nextBoolean();
				input.nextLine();
				System.out.println("\nEnter in Date: ");
				String in = input.nextLine();
				System.out.println("\nEnter out Date: ");
				String out = input.nextLine();
				System.out.println("\nEnter service responsible: ");
				String service = input.nextLine();
				System.out.println("\nEnter gear change");
				int gc = input.nextInt();
				System.out.println("\nEnter battery percentage: ");
				float bat = input.nextFloat();
				ElectricBike e = new ElectricBike(c,a,g,s,in,out,service,bat);				//Constructor
				e.get();
				e.setgearChange(gc);
				System.out.println("\n----------------------------\n");
				System.out.println("\nService status: " + e.getis_Serviced() + "\nIn Date: " + e.getinDate() + "\nOut Date: " + e.getoutDate() + "\nService responsible: " + e.getserviceResonsible() + "\nBattery Status: " + e.getBattery());
				e.chargeBike();
				e.checkoutService();
				System.out.println("\nGear Change: " + e.changeGear());
				e.checkBrakes();
			}else if(n == 3){												//MountainBike
				input.nextLine();
				System.out.println("\nEnter Color: ");	
				String c = input.nextLine();
				System.out.println("\nEnter Year: ");
				int a = input.nextInt();
				System.out.println("\nEnter number of Gears: ");
				int g = input.nextInt();
				System.out.println("\nEnter if serviced (true/false): ");
				boolean s = input.nextBoolean();
				input.nextLine();
				System.out.println("\nEnter in Date: ");
				String in = input.nextLine();
				System.out.println("\nEnter out Date: ");
				String out = input.nextLine();
				System.out.println("\nEnter service responsible: ");
				String service = input.nextLine();
				System.out.println("\nEnter gear change");
				int gc = input.nextInt();
				input.nextLine();
				System.out.println("\nEnter suspension: ");
				String sus = input.nextLine();
				System.out.println("\nEnter forks: ");
				String fo = input.nextLine();
				MountainBike m = new MountainBike(c,a,g,s,in,out,service,sus,fo);				//Constructor
				m.get();
				m.setgearChange(gc);
				System.out.println("\n----------------------------\n");
				System.out.println("\nService status: " + m.getis_Serviced() + "\nIn Date: " + m.getinDate() + "\nOut Date: " + m.getoutDate() + "\nService responsible: " + m.getserviceResonsible() +  "\nSuspension: " + m.getSuspension() + "\nForks: " + m.getForks());
				m.checkoutService();
				System.out.println("\nGear Change: " + m.changeGear());
				m.checkBrakes();
			}else if(n == 4){											//RoadBike
				input.nextLine();
				System.out.println("\nEnter Color: ");
				String c = input.nextLine();
				System.out.println("\nEnter Year: ");
				int a = input.nextInt();
				System.out.println("\nEnter number of Gears: ");
				int g = input.nextInt();
				System.out.println("\nEnter if serviced (true/false): ");
				boolean s = input.nextBoolean();
				input.nextLine();
				System.out.println("\nEnter in Date: ");
				String in = input.nextLine();
				System.out.println("\nEnter out Date: ");
				String out = input.nextLine();
				System.out.println("\nEnter service responsible: ");
				String service = input.nextLine();
				System.out.println("\nEnter gear change");
				int gc = input.nextInt();
				input.nextLine();
				System.out.println("\nEnter Tyres: ");
				String tt = input.nextLine();
				RoadBike r = new RoadBike(c,a,g,s,in,out,service,tt);				//Constructor
				r.get();
				r.setgearChange(gc);
				System.out.println("\n----------------------------\n");
				System.out.println("\nService status: " + r.getis_Serviced() + "\nIn Date: " + r.getinDate() + "\nOut Date: " + r.getoutDate() + "\nService responsible: " + r.getserviceResonsible() + "\nTyres: " + r.getTyres());
				r.checkoutService();
				System.out.println("\nGear Change: " + r.changeGear());
				r.checkBrakes();
			}else if(n == 5){														//Hibrid
				input.nextLine();
				System.out.println("\nEnter Color: ");
				String c = input.nextLine();
				System.out.println("\nEnter Year: ");
				int a = input.nextInt();
				System.out.println("\nEnter number of Gears: ");
				int g = input.nextInt();
				System.out.println("\nEnter if serviced (true/false): ");
				boolean s = input.nextBoolean();
				input.nextLine();
				System.out.println("\nEnter in Date: ");
				String in = input.nextLine();
				System.out.println("\nEnter out Date: ");
				String out = input.nextLine();
				System.out.println("\nEnter service responsible: ");
				String service = input.nextLine();
				System.out.println("\nEnter gear change");
				int gc = input.nextInt();
				input.nextLine();
				System.out.println("\nEnter Suspension: ");
				String sus = input.nextLine();
				Hibrid h = new Hibrid(c,a,g,s,in,out,service,sus);				//Constructor
				h.get();
				h.setgearChange(gc);
				System.out.println("\n----------------------------\n");
				System.out.println("\nService status: " + h.getis_Serviced() + "\nIn Date: " + h.getinDate() + "\nOut Date: " + h.getoutDate() + "\nService responsible: " + h.getserviceResonsible() +  "\nSuspension: " + h.getSuspension());
				h.checkoutService();
				System.out.println("\nGear Change: " + h.changeGear());
				h.checkBrakes();
			}else{
				System.out.println("Wrong Input!!");
			}
		}catch(Exception e){
			System.out.println("Exception: " + e);
		}
	}
}