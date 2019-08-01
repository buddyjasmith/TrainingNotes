import static org.junit.Assert.*;

import org.junit.Test;

public class ProductAnalysisTest {

	@Test
	public void UTC_O1() {
		assertEquals("t-shirt", ProductService.findNameByCode(104));
	}
	
	@Test
	public void UTC_O2() {
		assertNull(ProductService.findNameByCode(111));
	}
	
	@Test
	public void UTC_O3() {
		assertEquals("doll", ProductService.findNameByCode(107));
	}
	
	@Test
	public void UTC_O4() {
		assertNull(ProductService.findMaxPriceProduct("electronics"));
	}
	
	@Test
	public void UTC_O5() {
		Product p = ProductService.findMaxPriceProduct("computers");
		assertEquals("monitor", p.getProdName());
		assertEquals(103, p.getProdCode());
		assertEquals(5000, p.getPrice(),0.01);
	}
	
	@Test
	public void UTC_O6() {
		Product p = ProductService.findMaxPriceProduct("CLOTHING");
		assertEquals("jeans", p.getProdName());
		assertEquals(105, p.getProdCode());
		assertEquals(2000, p.getPrice(),0.01);
	}
}