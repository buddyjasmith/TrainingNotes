package searchdoctor;
//CHANGE IF REQUIRED

public class Doctor implements Comparable<Doctor>{

	private String name;
	private String speciality;
	private int experience;

	public Doctor() {
		super();
	}

	public Doctor(String name, String speciality, int experience) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.experience = experience;
	}
	

	@Override
	public String toString() {
		return String.format("%15s %15s %5d",name,speciality,experience) ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public int compareTo(Doctor arg0) {
		if(getName() == null || arg0.getName() == null)
			return 0;
		
		return getName().compareTo(arg0.getName());
	}
}