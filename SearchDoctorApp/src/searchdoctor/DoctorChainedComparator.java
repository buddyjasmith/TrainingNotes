package searchdoctor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DoctorChainedComparator implements Comparator<Doctor>{
	private List<Comparator<Doctor>> list;

	@SafeVarargs
	public DoctorChainedComparator(Comparator<Doctor>...comparators)
	{
		this.list = Arrays.asList(comparators);
	}
	@Override
	public int compare(Doctor o1, Doctor o2) {
		for(Comparator<Doctor> comparator: list) {
			int result = comparator.compare(o1, o2);
			if(result != 0) {
				return result;
			}
		}
		return 0;
	}
}
