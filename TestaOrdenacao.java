package App;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Domain.ContaPoupanca;

public class TestaOrdenacao {
	
	public static void main(String[] args) {
		
		Random aleatorio = new Random();
		
		/* 4 Questão -> Primeiro o Override da sobreescrita do método alertaria acerca do erro
		 * , e mesmo se o tirasse, assim que retornasse ao TestaOrdenacao, já não seria possível ao
		 * Collections fazer o sort, já que não foi encontrado seu método para ordenação.*/
		
		/* 5 Questão -> Não foi preciso modificar mais nada. */
		
		/* 6 Questão -> Inverter -> Collections.reverse(contas); Embaralhar -> Collections.shuffle(contas);
		 *  Rotacionar -> Collections.rotate(contas, 1).*/
		
		List<ContaPoupanca> contas = new ArrayList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		contas.add(c3);
	
		
		for (int i = 0; i < 5; i++) {
			
			ContaPoupanca cp = new ContaPoupanca();
			
			double saldo = aleatorio.nextInt(5000);
			int numeroAleatorio = aleatorio.nextInt(2000);
			
			cp.setNumero(numeroAleatorio);
			cp.setSaldo(saldo);
			contas.add(cp);
			}
		
		Collections.sort(contas);
		
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).toString());
			}
		}
	}
