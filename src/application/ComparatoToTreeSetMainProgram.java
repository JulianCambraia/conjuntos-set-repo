package application;

import java.util.Set;
import java.util.TreeSet;

import model.entities.Produto;

/**
 * O Conjunto TreeSet depende que seja implementado um Comparable
 * @author julian
 *
 */
public class ComparatoToTreeSetMainProgram {

	public static void main(String[] args) {
		Set<Produto> set = new TreeSet<>();
		set.add(new Produto("Tv", 900.00));
		set.add(new Produto("Notebook", 1200.00));
		set.add(new Produto("Tablet", 400.00));
		
		for (Produto produto : set) {
			System.out.println(produto);
		}

	}

}
