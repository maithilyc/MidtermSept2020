package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,poll elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> queue = new LinkedList<>();
		queue.poll();
		queue.add("NY");
		queue.add("CA");
		queue.add("TX");
		queue.add("FL");

		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.peek());
	}
	}


