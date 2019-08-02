import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EqualityCheckTest {
	@Test
	public void UTC_01() {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));

	}

	@Test
	public void UTC_02() {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);

		assertFalse(c1.equals(null));
	}

	@Test
	public void UTC_03() {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null,
				"vinod@mailinator.com");
		Customer c2 = new Customer(1, "Vinod", "Bangalore", null, null);

		assertFalse(c1.equals(c2));
		c2.setEmail("vinod@mailinator.com");
		assertTrue(c1.equals(c2));
	}
	
	@Test
	public void UTC_04() {
        Customer c1 = new Customer();
		c1.setCustomerId(101);
		assertEquals(101, c1.getCustomerId());	
	}
}
