package Domain;

public class ContaPoupanca extends Conta implements Tributavel, Comparable<ContaPoupanca>{

	@Override
	public void atualiza(double taxa) {
	    this.saldo += this.saldo * taxa * 3;
	  }
	
	public double calculaTributos() {
		// TODO Auto-generated method stub
		return this.getSaldo();
	}

	@Override
	public int compareTo(ContaPoupanca outro) {
		// TODO Auto-generated method stub
		return Integer.compare(this.getNumero(), outro.getNumero());
	}


}
