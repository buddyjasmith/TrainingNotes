
public class Customer {
	private int customerId;
	private String name;
	private String city;
	private String phone;
	private String email;
	
	public Customer() {
		super();
	}
	public Customer(int customerId, String name, String city, String phone, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)	
			return true;
		if(obj == null)	
			return false;
		if(this.getClass() != obj.getClass()) 
			return false;
		Customer customer = (Customer)obj;
		
		boolean flag0 = this.getCity().contentEquals( customer.getCity());
		boolean flag1 = this.getCustomerId() == customer.getCustomerId()	;
		boolean flag2 = this.getName().equals(customer.getName());
		boolean flag3 = this.getCity().equals(customer.getCity());
		boolean flag4 = this.getPhone().equals(customer.getPhone());
		boolean flag5 = this.getEmail().equals(customer.getEmail());
		return (flag0 && flag1 && flag2 && flag3 && flag4 && flag5);
	}
}

