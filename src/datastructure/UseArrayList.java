package datastructure;
import java.util.*;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> obj = new ArrayList<String>();

		obj.add("Maithily");
		obj.add("Ketryk");
		obj.add("Troy");
		obj.add("Carlie");

		System.out.println("Original ArrayList:");
		for(String str:obj)
			System.out.println(str);


		obj.add(0, "Victor");
		obj.add(1, "Laya");

		System.out.println("ArrayList after add operation:");
		for(String str:obj)
			System.out.println(str);

		obj.remove("Maithily");
		obj.remove("Ketryk");

		System.out.println("ArrayList after remove operation:");
		for(String str:obj)
			System.out.println(str);

		obj.remove(1);

		System.out.println("Final ArrayList:");
		for(String str:obj)
			System.out.println(str);
	}
}

