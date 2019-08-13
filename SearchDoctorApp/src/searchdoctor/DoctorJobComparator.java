package searchdoctor;

import java.util.Comparator;

public class DoctorJobComparator implements Comparator<Doctor>{

	@Override
	public int compare(Doctor doc0, Doctor doc1) {
		// TODO Auto-generated method stub
		return doc0.getSpeciality().compareTo(doc1.getSpeciality());
	}

}
