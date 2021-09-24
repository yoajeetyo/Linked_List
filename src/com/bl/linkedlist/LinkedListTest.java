package com.bl.linkedlist;

import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class LinkedListTest {

	@Test
	public void testFind() {
		LinkedList linkedList = new LinkedList();
		//linkedList2.find(head,30);
		linkedList.insert( 1,56);
		linkedList.insert( 2,70);
		linkedList.insert( 2,30);
		Assert.assertTrue(linkedList.find(30));
	}
}