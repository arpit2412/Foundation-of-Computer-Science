import java.util.*;
import java.io.*;
class Text{
	public static void main(String[] args) throws IOException{
		File f = new File("students.txt");
		File f1 = new File("students.txt");
		FileReader fr = new FileReader(f);
		FileReader fr1 = new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		BufferedReader br1 = new BufferedReader(fr1);
		int count = 0;
		String line =null;
		while((line=br1.readLine())!=null){
			count++;
		}
		count--;
		System.out.println(count);
		for(int j=0;j<20;j++){
			String str = br.readLine();
			String[] tokens = str.split(" ");
			System.out.println(tokens[0]);
		}
		fr.close();
		br.close();
	}
}