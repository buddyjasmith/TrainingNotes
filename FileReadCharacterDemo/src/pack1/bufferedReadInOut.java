package pack1;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bufferedReadInOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileInputStream input = new FileInputStream("/home/drew/Repos/TrainingNotes/One.txt");
			BufferedInputStream bis = new BufferedInputStream(input);
			//true appends file
			FileOutputStream output = new FileOutputStream("/home/drew/Repos/TrainingNotes/One1.txt",true);
			BufferedOutputStream bos = new BufferedOutputStream(output);){

		
			 int c;
		
			while((c=bis.read())!= -1) {
				System.out.print((char)c);
				bos.write((char)c);
				
			}
			}catch(FileNotFoundException f) {
				f.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
	}

}
