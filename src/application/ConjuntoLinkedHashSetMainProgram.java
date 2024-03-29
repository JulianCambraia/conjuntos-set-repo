package application;

import java.util.Set;
import java.util.TreeSet;

/**
 * HashSet é mais lento rápido porém ele ordena os elementos.
 * @author julian
 *
 */
public class ConjuntoLinkedHashSetMainProgram {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p: set) {
			System.out.println(p);
		}
	}
}
