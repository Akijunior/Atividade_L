package Domain;

import java.util.HashMap;
import java.util.Map;

public class Banco {
	
	public Map<String, Conta> listaContas = new HashMap<>();
	
	public void adicionaConta(String nome, Conta conta){
		listaContas.put(nome, conta);
	}
	
	public Conta buscarPorNome(String nome){
		
		Conta encontrada = listaContas.get(nome);
		return encontrada;
	}
	
	public int pegaTotalDeContas(){
		return listaContas.size();
	}
}
