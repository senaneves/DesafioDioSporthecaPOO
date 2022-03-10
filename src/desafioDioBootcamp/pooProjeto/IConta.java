package desafioDioBootcamp.pooProjeto;

public interface IConta {
	
	//interface j� � public portanto n�o precisa colocar no metodo

	void sacar(double valor);
	
	void depositar(double valor);
	
	void trasnferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
	
	
}
