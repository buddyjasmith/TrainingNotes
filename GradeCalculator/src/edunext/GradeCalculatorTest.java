package edunext;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class GradeCalculatorTest {

	HashMap<Integer, Integer> scores = new HashMap<Integer, Integer>();
	Map<Integer, String> result = null;

	public void teardown() {
		scores.clear();
		result = null;
	}

	@Test
	public void UTC_01() {
		scores.put(1222, 90);
		scores.put(1111, 75);
		result = GradeCalculator.calculateGrade(scores);
		assertThat(result.size(), is(2));
		assertEquals("[1111, 1222]", result.keySet().toString());
		assertEquals("[B, A]", result.values().toString());
	}

	@Test
	public void UTC_02() {
		scores.put(1222, 90);
		result = GradeCalculator.calculateGrade(scores);
		assertThat(result, instanceOf(TreeMap.class));
		assertThat(result.size(), is(1));
	}

	@Test
	public void UTC_03() {
		scores = null;
		result = GradeCalculator.calculateGrade(scores);
		assertThat(result, is(nullValue()));
	}


	@Test
	public void UTC_04() {
		scores.put(25, 30);
		scores.put(75, 65);
		scores.put(15, 85);
		scores.put(85, 55);

		result = GradeCalculator.calculateGrade(scores);
		assertThat(result.size(), is(4));
		assertEquals("[15, 25, 75, 85]", result.keySet().toString());
		assertThat(result.keySet().toString(), is(equalTo("[15, 25, 75, 85]")));
		assertThat(result.values().toString(), is(equalTo("[A, D, B, C]")));
	}
}
