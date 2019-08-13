package searchdoctor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DoctorService {

    //DONT MODIFY THIS	
	private List<Doctor> doctorsRepository;
	
	//DONT MODIFY THIS
	public DoctorService(List<Doctor> doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}
	
	public List<Doctor> getExperiencedDoctors(int years){
		return null;
	}

	public List<Doctor> getSpecialityDoctor(String speciality){
		System.out.println(doctorsRepository);
		List<Doctor> ret = new ArrayList<Doctor>();
		for(Doctor doctor: doctorsRepository) {
			System.out.println(doctor.getSpeciality());
			if(doctor.getSpeciality().equals(speciality)){
				System.out.println(doctor);
				ret.add(doctor);
			}		
		}
		Collections.sort(ret);
		return ret;
		
	}
	 


}