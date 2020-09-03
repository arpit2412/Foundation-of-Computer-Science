// Java program to illustrate the 
// concept of Multilevel inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class One{ 
	public void printGeek(){ 
		System.out.println("Geeks1"); 
	} 
} 

class Two extends One{ 
	public void printFor() 
	{ 
		System.out.println("for"); 
	} 
} 

class Three extends Two{ 
	public void printGeek() { 
		System.out.println("Geeks"); 
	} 
} 

// Drived class 
public class Main { 
	public static void main(String[] args) { 
		Three g = new Three(); 
		g.printGeek(); 
		g.printFor(); 
		g.printGeek();
		System.out.println("------------"); 
		One a = new Three();
		a.printGeek();
		//a.printFor();
		//f1(a);
	} 

	// static void f1(One a){}
	// static void f1(Three a){}
} 