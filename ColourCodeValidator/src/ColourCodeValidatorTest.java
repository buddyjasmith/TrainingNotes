import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ColourCodeValidatorTest {

	@Test
	public void UTC_01() {
		assertTrue(1 == ColourCodeValidator.validateHexCode("#FFF999"));
	}
	
	@Test
	public void UTC_02() {
		assertTrue(1 == ColourCodeValidator.validateHexCode("#123999"));
	}

	@Test
	public void UTC_03() {
		assertTrue(-1 == ColourCodeValidator.validateHexCode("#FFF9991"));
	}

	@Test
	public void UTC_04() {
		assertTrue(-1 == ColourCodeValidator.validateHexCode("#abc999"));
	}

	@Test
	public void UTC_05() {
		assertTrue(-1 == ColourCodeValidator.validateHexCode("#GHK999"));
	}

	@Test
	public void UTC_06() {
		assertTrue(-1 == ColourCodeValidator.validateHexCode("ABC123"));
	}

	@Test
	public void UTC_07() {
		assertTrue(1 == ColourCodeValidator.validateDecimalCode("rgb(188,4,249)"));
	}
	
	@Test
	public void UTC_08() {
		assertTrue(-1 == ColourCodeValidator.validateDecimalCode("rgb(a,b,c)"));
	}
	@Test
	public void UTC_09() {
		assertTrue(-1 == ColourCodeValidator.validateDecimalCode("rgb(300,121,155)"));
	}
	@Test
	public void UTC_10() {
		assertTrue(-1 == ColourCodeValidator.validateDecimalCode("rgb(188,4,249))"));
	}
	@Test
	public void UTC_11() {
		assertTrue(-1 == ColourCodeValidator.validateDecimalCode("188,4,249"));
	}
	@Test
	public void UTC_12() {
		assertTrue(-1 == ColourCodeValidator.validateDecimalCode("rgb(255,-1,999)"));
	}
}