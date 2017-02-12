package Domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class TestaPerfomance {
	public static void main(String[] args) {
		
		/* 1 - A inser��o. */
		/* 2 - Casos de ordena��o nos quais estivessem sendo usados alguns 
		 * m�todos pr�prios de uma das dadas classes. */
		/* 3 - Fiz manualmente. */
		/* 4 - A LinkedList foi mais r�pida. */
		
		System.out.println("Inicio >> \n\n");
		
		List<Integer> listaLinked = new LinkedList<>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			listaLinked.add(0, i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio)/100.0;
		System.out.println("O tempo total gasto foi igual a: " + tempo + " ms.");
		
		
		
		System.out.println("Fim da execu��o de tempo.");
	}

}
