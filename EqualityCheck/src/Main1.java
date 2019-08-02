import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main1 {
	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("/home/drew/Repos/TrainingNotes/One.txt"));
				BufferedInputStream bis = new BufferedInputStream(is);)
		{
			byte[] buffer = new byte[is.available()];
			bis.read(buffer);
			for(byte b: buffer) {
				System.out.println((char)b);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
