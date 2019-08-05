import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	public static void main(String[] args) {
		try(FileOutputStream fs = new FileOutputStream("/home/drew/persondata.dat");
			ObjectOutputStream objs = new ObjectOutputStream(fs);	){
			Student[] sarr = new Student[4];
			for(Student s: sarr) {
				//while(fs.available() > 0)
				//Deserialization STudent s = (Student)objs.readObject()
				//Use objectinputstream
				//s.setTotal();
				objs.writeObject(s);
				System.out.println(s);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
