public class Display {

    Estoque estoque = new Estoque();
    Acucar acucar = new Acucar();
    Ingrediente ingredientes = new Ingrediente();


    public void mostraOpcoesReabastecimento (){
        System.out.println("Por favor escolha um item para reabastecer");
        System.out.println();
        System.out.println("1. " + ingredientes.getPoDeCafe() + ", Maximo de unidades: " + estoque.getLimiteEstoquePoDeCafe() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualPoDeCafe());
        System.out.println("2. " + ingredientes.getChocolate() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChocolate() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChocolate());
        System.out.println("3. " + ingredientes.getLeiteEmPo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueLeiteEmPo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualLeiteEmPo());
        System.out.println("4. " + ingredientes.getChaDeLimao() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChaDeLimao() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChaDeLimao());
        System.out.println("5. " + estoque.getCopo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueCopo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualCopo());
        System.out.println("6. " + acucar.getAcucar() + ", Maximo de unidades: " + acucar.getLimiteEstoqueAcucar() + ", Quantidade atual disponível: " + acucar.getQuantidadeAtualAcucar());
        System.out.println();
    }

    public void mostraMaquinaDesligada () {
        System.out.println();
        System.out.println("------Maquina desligada------");
        System.out.println();
        System.out.println("Por favor reabasteça o estoque antes de ligar.");
        System.out.println();
    }

    public void mostraPedirNumeroDoPedido () {
        System.out.println("Digite o número referente ao seu pedido.");
        System.out.println();
    }

    public void mostraPerguntaDeConfirmacaoDoPedido () {
        System.out.println("Confirmar o pedido?");
        System.out.println("1. sim");
        System.out.println("2. não");
    }

    public void mostraAgradecimentoParaPrepararPedido () {
        System.out.println();
        System.out.println("Obrigado, agora iremos preparar o seu pedido");
        System.out.println();
    }
}
