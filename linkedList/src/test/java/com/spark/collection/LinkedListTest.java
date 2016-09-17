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
		/*
		 * Ideally there will be two test cases here. Will do it later. 1- test
		 * only void add() - using Mockito doNothing() and verify(atleast 1
		 * time) methods. 2 -contains as a separate test case
		 */
		LinkedList list = new LinkedList();
		list.add("ROCK");
		assertTrue(list.contains("ROCK"));

	}

	@Test
	public void testAddTwoItemsToList() {
		// Same comment as above. Will use Mokito for add.
		LinkedList list = new LinkedList();
		list.add("ROCK");
		list.add("PAPER");
		assertTrue(list.contains("ROCK"));
		assertTrue(list.contains("PAPER"));

	}

	@Test
	public void testAddThreeItemsToList() {
		// Same comment as above. Will use Mokito for add.
		LinkedList list = new LinkedList();
		list.add("ROCK");
		list.add("PAPER");
		list.add("SCISSORS");
		assertTrue(list.contains("ROCK"));
		assertTrue(list.contains("PAPER"));
		assertTrue(list.contains("SCISSORS"));

	}
}
