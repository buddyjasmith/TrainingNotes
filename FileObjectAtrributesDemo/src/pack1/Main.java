package pack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file1 = new File("/home/drew/Repos/TrainingNotes/One.txt");
		try {
			file1.createNewFile();		
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Created Successfully");
		System.out.println(file1.getName());
		System.out.println(file1.getAbsolutePath());
		System.out.println(file1.getParent());
		File dir = new File("/home/drew/Repos/TrainingNotes/");
		File[] fileList = dir.listFiles();
		for(File file : fileList) {
			if(file.isFile()) {
				System.out.println(file.getName());
			}
		}
	}

}
