package searchdoctor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SearchDoctorApp {
	
	//DON'T MODIFY THIS
	private static String doctorsData;
	
	//DON'T MODIFY THIS
	static {
		StringBuilder doctors = new StringBuilder();
		doctors.append("Amy-Pediatrics-16;");
		doctors.append("John-Dermatology-10;");
		doctors.append("David-Dermatology-15;");
		doctors.append("Bob-Pediatrics-6;");
		doctors.append("Cathy-Dermatology-5;");
		doctors.append("Mavis-Pediatrics-11;");
		doctors.append("Robin-Pediatrics-7;");
		doctors.append("Minty-Dermatology-9;");
		doctors.append("Jim-Cardiology-25;");
		doctorsData = doctors.toString();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//CODE START
		String dd = doctorsData.replace("-", " ");
		dd = dd.replace(";", "");
		String[] info = dd.split(" ");
		for(String doctor: info) {
			System.out.println(doctor);
		}
		System.out.println(info);
		List<Doctor> docs = new ArrayList<Doctor>();
		for(int i = 0; i < info.length-3; i++) {
			System.out.println(info[i] + " " + info[++i] + " " + info[++i]);
			docs.add(new Doctor(info[i],info[++i],Integer.parseInt(info[++i])));
		}
		System.out.println(docs.size());
		DoctorService ds = new DoctorService(docs);
		
		int choice = scan.nextInt();
		if(choice == 1) {
			
		}else if (choice == 2) {
			String speciality = scan.next();
			List<Doctor> found = ds.getSpecialityDoctor(speciality);
			System.out.println(found);
		}
		//CODE END
	}
}