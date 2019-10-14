package application;

import java.util.HashSet;
import java.util.Set;

/**
 * TreeSet é mais lento mas não garante a ordem do elementos
 * @author julian
 *
 */
public class ConjuntoTreeSetMainProgram {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		System.out.println(set.contains("Notebook"));
		
		for (String p: set) {
			System.out.println(p);
		}
	}
}
