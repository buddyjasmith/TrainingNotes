
public class EqualityCheck {

	public static void main(String[] args) {
		Customer zeek = new Customer(101, "Jon", "Miami", "911", "zeek@gmail.com");
		Customer bob = new Customer(101, "Jon", "Miami", "911", "zeek@gmail.com");
		
		if(zeek.equals(bob)) {
			System.out.println("Yuppers");
		}

	}

}
