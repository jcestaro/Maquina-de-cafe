package DesignPattern.ChainOfResponsibility;

public class OpcaoLeiteEmPo implements Reabastecimento {

	private Reabastecimento proximo;

	@Override
	public void setProximo(Reabastecimento proximo) {
		this.proximo = proximo;
	}

	@Override
	public void adicionarEstoque(int numeroDoIngredienteParaReabastecer) {
		if (numeroDoIngredienteParaReabastecer == 3){
			System.out.println();
			System.out.println("Você escolheu reabastecer: Leite em Pó");
			System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
		} else {
			proximo.adicionarEstoque(numeroDoIngredienteParaReabastecer);
		}
	}
}
