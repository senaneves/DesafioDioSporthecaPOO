package desafioDioBootcamp.pooProjeto;

public interface IConta {
	
	//interface já é public portanto não precisa colocar no metodo

	void sacar(double valor);
	
	void depositar(double valor);
	
	void trasnferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();
	
	
	
}
