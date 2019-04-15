package DesignPattern.ChainOfResponsibility;

public class OpcaoChocolate implements Reabastecimento {

	private Reabastecimento proximo;

	@Override
	public void setProximo(Reabastecimento proximo) {
		this.proximo = proximo;
	}

	@Override
	public void adicionarEstoque(int numeroDoIngredienteParaReabastecer) {
		if (numeroDoIngredienteParaReabastecer == 2){
			System.out.println();
			System.out.println("Você escolheu reabastecer: Chocolate");
			System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
		} else {
			proximo.adicionarEstoque(numeroDoIngredienteParaReabastecer);
		}
	}
}
