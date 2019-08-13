package com.edunext;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MergedListSortTest {

	List<Integer> l1;
	List<Integer> l2;

	@Before
	public void setup() {
		l1 = new ArrayList<>(Arrays.asList(3, 6, 9, 12, 15));
		l2 = new ArrayList<>(Arrays.asList(4, 8, 12, 16, 18));
	}

	@Test
	public void UTC_01() {
		List<Integer> actual = MergedListSort.mergeAndSort(l1, l2);
		List<Integer> expected = Arrays.asList(6, 12, 16);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<Integer> l3 = new ArrayList<>(l1);
		List<Integer> l4 = new ArrayList<>(l2);
		List<Integer> actual = MergedListSort.mergeAndSort(l1, l2);
		List<Integer> expected = Arrays.asList(6, 12, 16);
		assertEquals(expected, actual);
		assertEquals("Input list modified", l3, l1);
		assertEquals("Input list modified", l4, l2);
	}
	
	
	@Test
	public void UTC_04() {
		Collections.fill(l1, 0);
		Collections.fill(l2, 0);
		List<Integer> actual = MergedListSort.mergeAndSort(l1, l2);
		List<Integer> expected = Arrays.asList(0, 0, 0);
		assertEquals(expected, actual);
	}




}
