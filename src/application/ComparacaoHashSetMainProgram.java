package application;

import java.util.HashSet;
import java.util.Set;

import model.entities.Produto;

public class ComparacaoHashSetMainProgram {

	public static void main(String[] args) {
		Set<Produto> set = new HashSet<>();
		set.add(new Produto("Tv", 900.00));
		set.add(new Produto("Notebook", 1200.00));
		set.add(new Produto("Tablet", 400.00));
		
		Produto prod = new Produto("Notebook", 1200.00);
		System.out.println(set.contains(prod)); // gera false pois Produto não tem HashCode e Equals para realizar a comparação e desta forma é feita a comparação pelas referências de memória
		// Uma vez adicionado o Equals e HashCode a comparação dará verdadeiro

	}

}
