import java.util.Scanner;

public class ProductAnalysis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		scan.nextLine();
		
		if(choice== 1) {
			int code = scan.nextInt();
			String name = ProductService.findNameByCode(code);
			System.out.println(name== null? "Product Not Found":name);
		}else
		 if(choice ==2) {
			 
			 String category = scan.nextLine().toLowerCase();
			 Product p = ProductService.findMaxPriceProduct(category);
			 System.out.println(p==null?"No products in given category":
					 			p.getProdCode()+" | "+p.getProdName()+" | "+p.getPrice());
		 }else {
			 System.out.println("Invalid choice");
		 }
		scan.close();
	}
}