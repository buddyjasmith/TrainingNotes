//DO NOT EDIT THIS CLASS
public class ProductData {
	
	private static Product[] products;
				
	static {
		products = new Product[8];
		products[0] = new Product(101, "keyboard", 300, "computers");
		products[1] = new Product(102, "mouse", 600, "computers");
		products[2] = new Product(103, "monitor", 5000, "computers");
		products[3] = new Product(104, "t-shirt", 500, "clothing");
		products[4] = new Product(105, "jeans", 2000, "clothing");
		products[5] = new Product(106, "sweater", 1000, "clothing");
		products[6] = new Product(107, "doll", 500, "toys");
		products[7] = new Product(108, "car", 1000, "toys");
	}

	public static Product[] getProducts() {
		return products;
	}
}