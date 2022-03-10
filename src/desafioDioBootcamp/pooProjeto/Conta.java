package desafioDioBootcamp.pooProjeto;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	// usar o abstract faz com que a classe conta nunca seja instanciada, 
	// pois não faz sentido
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
public Conta(Cliente cliente) {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		
	}
	
	public void sacar() {
		
	}
	public void depositar() {
		
	}
	public void trasnferir() {
		
	}
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}
	@Override
	
	// implementacao originao utilizou contaDestino do tipo Conta
	// modificaremos para tipo IConta para usar a interface criada
	public void trasnferir(double valor, IConta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Agencia: %d", this.numero));
		System.out.println(String.format("Agencia: %.2f", this.saldo));
	}

}
