public class Maquina {

    private String pedidoConfirmado;
    private String pedidoSelecionado;
    Opcoes opcoes = new Opcoes();
    private String opcoesPagamento;
    private String pedidoCobrado;
    private String pedidoPreparado;
    private String pedidoEntregue;

    public String selecionarPedido (int numeroPedido) {
        switch (numeroPedido) {
            case 1:
                System.out.println("\n" + "Você selecionou "
                        + opcoes.getCafe()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
                break;

            case 2:
                System.out.println("\n" + "Você selecionou "
                        + opcoes.getCafeComLeite()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
                break;

            case 3:
                System.out.println("\n" + "Você selecionou "
                        + opcoes.getCapuccino()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
                break;

            case 4:
                System.out.println("\n" + "Você selecionou "
                        + opcoes.getCha()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
                break;

            case 5:
                System.out.println("\n" + "Você selecionou "
                        + opcoes.getAguaQuente()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
                break;

            default:
                System.out.println("\n" + "Você não selecionou nenhuma opção válida, portanto a opção padrão é: "
                        + opcoes.getCafe()
                        + ", Confirmar o pedido? \n"
                        + "\n 1. sim \n 2. não" + "\n");
        }
        return pedidoSelecionado;
    }

    public String confirmarPedido (int opcaoSelecionada) {

        switch (opcaoSelecionada) {

            case 1:
                System.out.println("\n" + "Por favor selecione o nível de Açucar, de 0 a 5." + "\n");
                break;

            case 2:
                System.out.println("\n" + "Obrigado, volte sempre!");
                System.exit(0);
                break;

            default:
                System.out.println("\n" + "Obrigado, volte sempre!");
                System.exit(0);
        }
        return pedidoConfirmado;
    }

    public String opcoesCobrarPedido (){
        System.out.println("\n" + "Por favor escolha o valor para o pagamento." + "\n"
                + "\n" + "1. " + "R$ 1.00"
                + "\n" + "2. " + "R$ 2.00"
                + "\n" + "3. " + "R$ 5.00"
                + "\n" + "4. " + "R$ 10.00" + "\n");

        return opcoesPagamento;
    }

    public String cobrarPedido (int dinheiro, int numeroPedido) {
        switch (dinheiro) {

            case 1:
                if (numeroPedido == 2 || numeroPedido == 3) {
                    System.out.println("\n" + "O valor para pagamento selecionado não é o suficiente para este pedido." + "\n");
                } else if (numeroPedido == 5) {
                    System.out.println("\n" + "Seu troco é: R$ 1.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else {
                    System.out.println("\n" + "Obrigado, agora iremos preparar o seu pedido." + "\n");
                }
                break;

            case 2:
                if (numeroPedido == 1 || numeroPedido == 4) {
                    System.out.println("\n" + "Seu troco é: R$ 1.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 5) {
                    System.out.println("\n" + "Seu troco é: R$ 2.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 2) {
                    System.out.println("\n" + "Seu troco é: R$ 0.50" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 3) {
                    System.out.println("\n" + "Obrigado, agora iremos preparar o seu pedido." + "\n");
                }
                break;

            case 3:
                if (numeroPedido == 1 || numeroPedido == 4) {
                    System.out.println("\n" + "Seu troco é: R$ 4.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 5) {
                    System.out.println("\n" + "Seu troco é: R$ 5.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 2) {
                    System.out.println("\n" + "Seu troco é: R$ 3.50" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 3) {
                    System.out.println("\n" + "Seu troco é: R$ 3.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                }
                break;

            case 4:
                if (numeroPedido == 1 || numeroPedido == 4) {
                    System.out.println("\n" + "Seu troco é: R$ 9.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 5) {
                    System.out.println("\n" + "Seu troco é: R$ 10.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 2) {
                    System.out.println("\n" + "Seu troco é: R$ 8.50" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                } else if (numeroPedido == 3) {
                    System.out.println("\n" + "Seu troco é: R$ 8.00" + "\n"
                            + "\n" + "Obrigado, agora iremos preparar o seu pedido" + "\n");
                }
                break;
        }

        return pedidoCobrado;
    }

    public String preparaPedido(int numeroPedido) {
        switch (numeroPedido) {

            case 1:
                try{
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                }
                catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 2:
                try{
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                }
                catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 3:
                try{
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o chocolate...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando a canela em pó...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                }
                catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 4:
                try{
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá na água...");
                    Thread.sleep(3000);
                    System.out.println("Aguarde...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                }
                catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 5:
                try{
                    System.out.println("\n" + "Fervendo a água...");
                    Thread.sleep(2000);
                    System.out.println("Colocando a água quente no copo.");
                }
                catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;
        }
        return pedidoPreparado;
    }

    public String entregaPedido (int numeroPedido) {
        try {
            System.out.println("\n" + "Seu pedido de número: " + numeroPedido + " está pronto!");
            Thread.sleep(2000);
            System.out.println("Obrigado, volte sempre!");
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }

        return pedidoEntregue;
    }
}