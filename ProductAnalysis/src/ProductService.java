//CODE HERE
public class ProductService{
    private static Product[] prod;
    public static String findNameByCode(int code){
    	
    	prod = ProductData.getProducts();
    	for(int i = 0; i < prod.length;i++) {
    		if( prod[i].getProdCode() == code) {
    			return prod[i].getProdName();
    		}
    	}
    	return null;
        
    }
    public static Product findMaxPriceProduct(String product){
		prod = ProductData.getProducts();
    	double max = -Double.MAX_VALUE;
    	Product ret = null;
    	for(int i =0;i < prod.length;i++) {
    		if(prod[i].getCategory().equals(product)) {
    			if(prod[i].getPrice() > max) {
    				max = prod[i].getPrice();
    				ret = new Product(prod[i].getProdCode(), prod[i].getProdName(), max, prod[i].getCategory());
    			}
    		}
    	}
		return ret;
    }
}