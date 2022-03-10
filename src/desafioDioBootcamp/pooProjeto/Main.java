package desafioDioBootcamp.pooProjeto;

public class Main {

	public static void main(String[] args) {
		
			
		Cliente marcio = new Cliente();
		marcio.setNome("Marcio");
		
		
		Cliente paty = new Cliente();
		paty.setNome("Paty");
		
		
		IConta cCorrente = new ContaCorrente(marcio);
		cCorrente.depositar(100);
		
		IConta cPoupanca = new ContaPoupanca(paty);
		
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
		
		cCorrente.trasnferir(50, cPoupanca);
		cCorrente.imprimirExtrato();
		cPoupanca.imprimirExtrato();
				
	}

}
