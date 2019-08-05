
public class Customer {
	private int customerId;
	private String name;
	private String city;
	private String phone;
	private String email;
	
	public Customer() {
		super();
		customerId = 0;
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
		if(this == obj) {	
			return true;
		}
		if(obj == null)	{
			return false;
		}
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		Customer customer = (Customer)obj;
		boolean[] flag = new boolean[6];
		try {
			 flag[0] = this.getCity().contentEquals( customer.getCity());
			 
			 
		}catch(NullPointerException n) {
			flag[0]=(this.getCity() == null) && (customer.getCity() == null)?
				    true : false;
		}
		//check int comparison
		flag[1] = (this.getCustomerId() == customer.getCustomerId());
		try {
			flag[2] = this.getName().equals(customer.getName());
		}catch(NullPointerException n) {
			flag[2] = (this.getName() == null && customer.getName()== null) ?
					  true : false;	
		}try {
			flag[3]= this.getCity().equals(customer.getCity());
		}catch(NullPointerException n){
			flag[3] = (this.getCity() == null && customer.getCity() == null)?
					  true : false;
		}try {
			flag[4] = this.getPhone().equals(customer.getPhone());
		}catch(NullPointerException n) {
			flag[4] = (this.getPhone() == null && customer.getPhone() == null)?
					  true : false;
		}try {
			flag[5] = this.getEmail().equals(customer.getEmail());
		}catch(NullPointerException n) {
			flag[5] = (this.getEmail() == null && customer.getEmail() == null)?
					  true : false;
		}
	
		return (flag[0] && flag[1] && flag[2] && flag[3] && flag[4] && flag[5]);
		
		}
}

