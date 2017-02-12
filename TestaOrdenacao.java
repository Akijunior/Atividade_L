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
		
		/* 4 Quest�o -> Primeiro o Override da sobreescrita do m�todo alertaria acerca do erro
		 * , e mesmo se o tirasse, assim que retornasse ao TestaOrdenacao, j� n�o seria poss�vel ao
		 * Collections fazer o sort, j� que n�o foi encontrado seu m�todo para ordena��o.*/
		
		/* 5 Quest�o -> N�o foi preciso modificar mais nada. */
		
		/* 6 Quest�o -> Inverter -> Collections.reverse(contas); Embaralhar -> Collections.shuffle(contas);
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
