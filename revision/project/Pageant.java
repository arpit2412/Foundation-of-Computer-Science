import java.util.*;
class Pageant{
	int counter =0;
	Finalist next;
	Contestant head;
	public void addFinalist(Finalist tmp){
		if(counter<3){
			counter++;
			Finalist f = new Finalist(tmp);
			if(head == null){
				head = next = f;
			}
			next.setNext(f);
			next = f;
		}
	}	

	// public void sortFinalist(){
	// 	int max = 0;
	// 	while(head!=next)
	// 	if(max>f.mean()){
	// 		max = mean;
	// 	}
	// }

	public void printFinalist(){
		while(head!=next){
			Finalist f = new Finalist(head);
			f.display();
			f = f.getNext();
		}
	}
}