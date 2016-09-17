package com.spark.collection;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	private LinkedList list;

	@Before
	public void setup() {
		list = new LinkedList();
	}

	@Test
	public void testCreateLinkedListInstance() {
		assertTrue(new LinkedList() instanceof LinkedList);
	}

	@Test
	public void testCreateEmptyList() {
		assertTrue(list.isEmpty());
	}

	@Test
	public void testAddItemToList() {
		/*
		 * Ideally there will be two test cases here. Will do it later. 1- test
		 * only void add() - using Mockito doNothing() and verify(atleast 1
		 * time) methods. 2 -contains as a separate test case
		 */
		list.add("ROCK");
		assertTrue(list.contains("ROCK"));

	}

	@Test
	public void testAddTwoItemsToList() {
		// Same comment as above. Will use Mokito for add.
		list.add("ROCK");
		list.add("PAPER");
		assertTrue(list.contains("ROCK"));
		assertTrue(list.contains("PAPER"));

	}

	@Test
	public void testAddThreeItemsToList() {

		list.add("ROCK");
		list.add("PAPER");
		list.add("SCISSORS");
		assertTrue(list.contains("ROCK"));
		assertTrue(list.contains("PAPER"));
		assertTrue(list.contains("SCISSORS"));

	}

	@Test
	public void testDeleteFirstItemFromList() {

		list.add("ROCK");
		assertTrue(list.contains("ROCK"));

		list.delete("ROCK");
		assertFalse(list.contains("ROCK"));

	}

	@Test
	public void testDeleteSecondItemFromList() {

		list.add("ROCK");
		list.add("PAPER");
		list.add("SCISSORS");
		assertTrue(list.contains("ROCK"));
		assertTrue(list.contains("PAPER"));
		assertTrue(list.contains("SCISSORS"));

		list.delete("PAPER");
		assertTrue(list.contains("ROCK"));
		assertFalse(list.contains("PAPER"));
		assertTrue(list.contains("SCISSORS"));

	}

	@After
	public void cleanup() {
		list = null;
	}
}
