package com.mpahsis.pack1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.mpahsis.serialize.Person;

public class Main {

	public static void main(String[] args) {
		
		try( FileOutputStream fs = new FileOutputStream("/home/drew/person.dat");
			 ObjectOutputStream os = new ObjectOutputStream(fs);) 
		{

			Person[] parr = new Person[3];
			parr[0] = new Person(10,"Kiel",25);
			parr[1] = new Person(20,"John",30);
			parr[2] = new Person(30,"Manoj",25);
			
			for(Person p: parr) {
				try {
					os.writeObject(p);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			
		
	}

}
