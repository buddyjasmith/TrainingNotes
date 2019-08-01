package pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileReader input = new FileReader("/home/drew/Repos/TrainingNotes/One.txt");
			BufferedReader br = new BufferedReader(input);){
			String str;
		
			 str = br.readLine();
		
			while((str = br.readLine()) != null) {
				
				System.out.println(str);
			
			}
			}catch(FileNotFoundException f) {
				f.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}

	}

}
