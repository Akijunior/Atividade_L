
package Domain;
import Domain.SaldoInsuficientException;

public class Conta {
	
	protected int numero;
	protected Double saldo = 0.0;
	private Double limite = 0.0;
	public Cliente titular = new Cliente();
	public String dono;
	
	public void Conta(){
		if (titular == null){
			try {
				System.out.println("Conta criada com sucesso!");
			}
			catch( NullPointerException e){
				System.out.println("Não é possivel criar uma conta nula. Erro "+ e);
			}
		}
	}
	
	/* Get and Set methods */
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	
	public void setSaldo(Double saldo) {
		
		this.saldo = saldo;	
	}
	
	public double getSaldo() {
		
		try{
			return this.saldo;
		}
		catch(NullPointerException e){
			System.out.println("Erro -> " + e);
		}
		return 0;
		
	}
	
	public void setLimite(double i) {
		this.limite = i;	
	}
	
	/* System Methods */
	
	public void saca2(double valor) throws SaldoInsuficientException{
		if(this.saldo < valor){
			throw new SaldoInsuficientException("Saldo Insuficiente, "
					+ "tente um valor menor.");
		}
		else{
			this.saldo -= valor;
		}
	}
	
	
	public boolean saca(double valor){
		
		if(valor > this.saldo + this.limite) {
			System.out.println("Não pode sacar fora do limite!");
			throw new IllegalArgumentException();
			}
		else {
			this.saldo -= valor;
			}
		return true;
		}
	

	
	public void deposita(Double valor) {
		
		if(valor <= 0) {
			throw new ValorNegativoException(valor);
			}
		else {
			this.saldo += valor;
			}
		}
	
	
	public void verificarSaldo(){
		
		System.out.println("Valor do Saldo: " + getSaldo());
		}
	
	
	public boolean transferePara(Conta destino, double valor) {
		
		if(valor > this.saldo + this.limite) {
			System.out.println("Não pode transferir fora do limite!");
			throw new IllegalArgumentException();
			}	
		
		else {
			destino.deposita(valor);
			return true;
			}
		}
	public void atualiza(double taxa) {
		this.saldo += (this.saldo * taxa);
		// TODO Auto-generated method stub
		
		}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + ", titular=" + titular
				+ ", dono=" + dono + "]";
	}
	}




