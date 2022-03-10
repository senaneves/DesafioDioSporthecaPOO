package desafioDioBootcamp.pooProjeto;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void imprimirExtrato() {
		
		System.out.println("##### Extrato Conta Corrrente #####");
		super.imprimirInformacoesComuns();
	}
	
}
