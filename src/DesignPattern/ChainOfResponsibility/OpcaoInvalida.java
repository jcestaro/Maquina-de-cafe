package DesignPattern.ChainOfResponsibility;

public class OpcaoInvalida implements Reabastecimento {

	@Override
	public void adicionarEstoque(int numeroDoIngredienteParaReabastecer) {
		System.out.println("Nenhum item válido selecionado");
	}

	@Override
	public void setProximo(Reabastecimento proximo) {

	}
}
