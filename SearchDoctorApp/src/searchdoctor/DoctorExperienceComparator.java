package searchdoctor;

import java.util.Comparator;

public class DoctorExperienceComparator implements Comparator<Doctor>{

	@Override
	public int compare(Doctor o1, Doctor o2) {
		// TODO Auto-generated method stub
		return o1.getExperience() - o2.getExperience();
	}

}
