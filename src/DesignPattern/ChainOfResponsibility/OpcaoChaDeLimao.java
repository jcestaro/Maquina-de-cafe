package DesignPattern.ChainOfResponsibility;

public class OpcaoChaDeLimao implements Reabastecimento {

	private Reabastecimento proximo;

	@Override
	public void setProximo(Reabastecimento proximo) {
		this.proximo = proximo;
	}

	@Override
	public void adicionarEstoque(int numeroDoIngredienteParaReabastecer) {
		if (numeroDoIngredienteParaReabastecer == 4){
			System.out.println();
			System.out.println("Você escolheu reabastecer: Chá de Limão");
			System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
		} else {
			proximo.adicionarEstoque(numeroDoIngredienteParaReabastecer);
		}
	}
}
