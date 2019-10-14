package application;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * LinkedHashSet é intermediario na velocidade rápido porém ele mantem a ordem na qual os elementos foram inseridos.
 * @author julian
 *
 */
public class ConjuntoHashSetMainProgram {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");
		
		// set.remove("Tablet");
		// set.removeIf(x -> x.length()>=3);
		set.removeIf(x -> x.charAt(0)=='T');
		
		System.out.println(set.contains("Notebook"));
		
		for (String p: set) {
			System.out.println(p);
		}
	}
}
