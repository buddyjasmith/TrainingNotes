import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DistinctCustomerListTest {

	@Test
	public void UTC_01() {
		List<Integer> input1 = new ArrayList<>(Arrays.asList(301, 310, 305, 306));
		List<Integer> input2 = new ArrayList<>(Arrays.asList(306, 307, 308));
		Integer[] expected = { 310, 308, 307, 305, 301 };
		Integer[] actual = DistinctCustomerList.getDistinctCustomers(input1, input2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<Integer> input3 = new ArrayList<>(Arrays.asList(301, 302, 302));
		List<Integer> input4 = new ArrayList<>(Arrays.asList(302, 303, 303));
		Integer[] expected = { 303, 301 };
		Integer[] actual = DistinctCustomerList.getDistinctCustomers(input3, input4);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		List<Integer> input3 = new ArrayList<>(Arrays.asList(301, 302, 302));
		List<Integer> input4 = new ArrayList<>(Arrays.asList(301, 302, 302));
		Integer[] expected = {};
		Integer[] actual = DistinctCustomerList.getDistinctCustomers(input3, input4);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		List<Integer> input3 = new ArrayList<>();
		List<Integer> input4 = null;
		Integer[] expected = {};
		Integer[] actual = DistinctCustomerList.getDistinctCustomers(input3, input4);

		assertArrayEquals(expected, actual);
	}

}