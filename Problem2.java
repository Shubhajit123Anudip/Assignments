package Assignments.java;
/*Write a java program of swap two elements in alinked list*/

import java.util.Collections;
import java.util.LinkedList;

public class Problem2 {

	public static void main(String[] args) {
		LinkedList <String> ll = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  ll.add("Red");
		  ll.add("Green");
		  ll.add("Black");
		  ll.add("Pink");
		  ll.add("orange");
		  // print the list
		  System.err.println("The Original linked list: " + ll);
		    Collections.swap(ll, 0, 3);
		    System.out.println("The New linked list after swap: " + ll);
		 }

}
