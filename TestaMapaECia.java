package Domain;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestaMapaECia {
	public static void main(String[] args){
		
		Map<String, ContaPoupanca> mapaDeContas = new HashMap<>();

		ContaPoupanca c1 = new ContaPoupanca();
		c1.deposita(1973.0);
		mapaDeContas.put("Diretor", c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.deposita(1462.0);
		mapaDeContas.put("Gerente", c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.deposita(1854.0);
		mapaDeContas.put("Estagiario", c3);
		
		ContaPoupanca contaDoDiretor = mapaDeContas.get("Diretor");
		System.out.println(contaDoDiretor.getSaldo());
		

		
	}
}
