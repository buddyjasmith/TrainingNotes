package com.mpahsis.serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainPerson {
	public static void main(String[] args) {
		try(FileInputStream fs = new FileInputStream("/home/drew/person.dat");
				ObjectInputStream objs = new ObjectInputStream(fs);)
		{
			while(fs.available()>0) {
				
				Person p = (Person)objs.readObject();
			}
		}catch(IOException e) {
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
