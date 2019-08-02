import java.io.Serializable;

public class Student implements Serializable{

	private int stdID;
	private int m1;
	private int m2;
	private transient int total;
	public Student(int stdID, int m1, int m2, int total) {
		super();
		this.stdID = stdID;
		this.m1 = m1;
		this.m2 = m2;
		
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal() {
		this.total = this.m1 + this.m2;
	}
	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", m1=" + m1 + ", m2=" + m2 + ", total=" + total + "]";
	}
	
	
}
