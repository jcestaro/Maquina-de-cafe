package DesignPattern.ChainOfResponsibility;

public interface Reabastecimento {

	void adicionarEstoque(int numeroDoIngredienteParaReabastecer);
	void setProximo(Reabastecimento proximo);

}
