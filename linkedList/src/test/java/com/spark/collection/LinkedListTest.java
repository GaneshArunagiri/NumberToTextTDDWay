package com.spark.collection;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testCreateLinkedListInstance() {
		assertTrue(new LinkedList() instanceof LinkedList);
	}

	@Test
	public void testCreateEmptyList() {
		LinkedList list = new LinkedList();
		assertTrue(list.isEmpty());
	}

	@Test
	public void testAddItemToList() {
		/*Ideally there will be two test cases here. Will do it later.
		 * 1- test only void add() - using Mockito doNothing() and verify(atleast 1 time) methods.
		 * 2 -contains as a separate test case
		 */
		LinkedList list = new LinkedList();
		list.add("ROCK");
		assertTrue(list.contains("ROCK"));

	}
}
