import java.util.Scanner;

public class Maquina {

    Menu menu = new Menu();
    Estoque estoque = new Estoque();
    Ingrediente ingredientes = new Ingrediente();
    Acucar acucar = new Acucar();
    Display display = new Display();
    Scanner scanner = new Scanner(System.in);
    private int numeroMaximoOpcoesDeCobranca = 4;
    private int numeroMinimoOpcoesDeCobranca = 1;

    public void escolherQntdUnidadesParaAbastecimento (int numeroDoIngredienteParaReabastecer, int quantidadeDeUnidades) {
        switch (numeroDoIngredienteParaReabastecer) {
            case 1:
                estoque.setQuantidadeAtualPoDeCafe(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + estoque.getQuantidadeAtualPoDeCafe() + " unidades no estoque de " + ingredientes.getPoDeCafe());
                break;

            case 2:
                estoque.setQuantidadeAtualChocolate(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + estoque.getQuantidadeAtualChocolate() + " unidades no estoque de " + ingredientes.getChocolate());
                break;

            case 3:
                estoque.setQuantidadeAtualLeiteEmPo(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + estoque.getQuantidadeAtualLeiteEmPo() + " unidades no estoque de " + ingredientes.getLeiteEmPo());
                break;

            case 4:
                estoque.setQuantidadeAtualChaDeLimao(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + estoque.getQuantidadeAtualChaDeLimao() + " unidades no estoque de " + ingredientes.getChaDeLimao());
                break;

            case 5:
                estoque.setQuantidadeAtualCopo(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + estoque.getQuantidadeAtualCopo() + " unidades no estoque de " + estoque.getCopo());
                break;

            case 6:
                acucar.setQuantidadeAtualAcucar(quantidadeDeUnidades);
                System.out.println();
                System.out.println("Você agora possui: " + acucar.getQuantidadeAtualAcucar() + " unidades no estoque de " + acucar.getAcucar());
                break;

            default:
                System.out.println();
                System.out.println("Nenhum item válido selecionado");
                System.out.println();
                escolherItemParaReabastecer();
                break;
        }
        FecharCompartimentoOuContinuarAbastecendo();
        escolherItemParaReabastecer();
    }

    public void abastecerItemEscolhido (int numeroDoIngredienteParaReabastecer) {
        switch (numeroDoIngredienteParaReabastecer) {
            case 1:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + ingredientes.getPoDeCafe());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                break;

            case 2:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + ingredientes.getChocolate());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                break;

            case 3:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + ingredientes.getLeiteEmPo());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                break;

            case 4:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + ingredientes.getChaDeLimao());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                break;

            case 5:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + estoque.getCopo());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                break;

            case 6:
                System.out.println();
                System.out.println("Você escolheu reabastecer: " + acucar.getAcucar());
                System.out.println("Insira a quantidade de unidades para reabastecer esse item.");
                System.out.println();
                break;

            default:
                System.out.println();
                System.out.println("Nenhum item válido selecionado");
                System.out.println();
                escolherItemParaReabastecer();
                break;
        }

        int quantidadeDeUnidades = scanner.nextInt();

        escolherQntdUnidadesParaAbastecimento(numeroDoIngredienteParaReabastecer, quantidadeDeUnidades);
    }

    public void escolherItemParaReabastecer () {
        System.out.println("Por favor escolha um item para reabastecer");
        System.out.println();
        System.out.println("1. " + ingredientes.getPoDeCafe() + ", Maximo de unidades: " + estoque.getLimiteEstoquePoDeCafe() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualPoDeCafe());
        System.out.println("2. " + ingredientes.getChocolate() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChocolate() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChocolate());
        System.out.println("3. " + ingredientes.getLeiteEmPo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueLeiteEmPo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualLeiteEmPo());
        System.out.println("4. " + ingredientes.getChaDeLimao() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChaDeLimao() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChaDeLimao());
        System.out.println("5. " + estoque.getCopo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueCopo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualCopo());
        System.out.println("6. " + acucar.getAcucar() + ", Maximo de unidades: " + ingredientes.acucar.getLimiteEstoqueAcucar() + ", Quantidade atual disponível: " + acucar.getQuantidadeAtualAcucar());
        System.out.println();

        int numeroDoIngredienteParaReabastecer = scanner.nextInt();
        abastecerItemEscolhido(numeroDoIngredienteParaReabastecer);
    }

    public void maquinaDesligada () {
        display.mostraMaquinaDesligada();

        int selecionarOpcao = scanner.nextInt();

        if (selecionarOpcao == 1) {
            escolherItemParaReabastecer();
        } else if (selecionarOpcao == 2){
            menu.mostraOpcoes();
            pedirNumeroDoPedido();
        } else {
            maquinaDesligada();
        }
    }

    public void FecharCompartimentoOuContinuarAbastecendo () {

        display.mostraFecharCompartimentoOuContinuarAbastecendo();

        int selecionarOpcao = scanner.nextInt();

        if (selecionarOpcao == 1){
            maquinaDesligada();
        } else {
            escolherItemParaReabastecer();
        }
    }

    public void pedirNumeroDoPedido () {
        display.mostraPedirNumeroDoPedido();

        int numeroDoPedido = scanner.nextInt();
        selecionarPedido(numeroDoPedido);
    }


    public void selecionarPedido (int numeroPedido) {
        switch (numeroPedido) {
            case 1:
                System.out.println();
                System.out.println("Você selecionou: " + menu.getCafe());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;

            case 2:
                System.out.println();
                System.out.println("Você selecionou: " + menu.getCafeComLeite());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;

            case 3:
                System.out.println();
                System.out.println("Você selecionou: " + menu.getCapuccino());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;

            case 4:
                System.out.println();
                System.out.println("Você selecionou: " + menu.getCha());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;

            case 5:
                System.out.println();
                System.out.println("Você selecionou: " + menu.getAguaQuente());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;

            default:
                System.out.println();
                System.out.println("Você não selecionou nenhuma opção válida, portanto a opção padrão é: "
                        + menu.getCafe());
                display.mostraPerguntaDeConfirmacaoDoPedido();
                break;
        }

        int opcaoSelecionada = scanner.nextInt();
        confirmarPedido(opcaoSelecionada, numeroPedido);
    }

    public void confirmarPedido (int opcaoSelecionada, int numeroDoPedido) {

        switch (opcaoSelecionada) {

            case 1:
                System.out.println();
                System.out.println("Por favor selecione o nível de Açucar, de "
                        + acucar.getNivelAcucarMinimo() + " a " + acucar.getNivelAcucarMaximo());
                System.out.println();
                break;

            case 2:
                menu.mostraOpcoes();
                pedirNumeroDoPedido();
                break;

            default:
                menu.mostraOpcoes();
                pedirNumeroDoPedido();
                break;
        }

        int nivelAcucarSelecionado = scanner.nextInt();
        acucar.selecionarNivelAcucar(nivelAcucarSelecionado, numeroDoPedido);
        opcoesCobrarPedido(numeroDoPedido);
    }

    public void opcoesCobrarPedido (int numeroDoPedido){
        display.mostraOpcoesParaCobrarPedido();
        int dinheiro = scanner.nextInt();
        cobrarPedido(dinheiro, numeroDoPedido);
    }

    public void cobrarPedido (int dinheiro, int numeroPedido) {

        if (dinheiro <= numeroMaximoOpcoesDeCobranca && dinheiro >= numeroMinimoOpcoesDeCobranca) {
            switch (dinheiro) {
                case 1:
                    if (numeroPedido == 2 || numeroPedido == 3) {
                        System.out.println();
                        System.out.println("O valor para pagamento selecionado não é o suficiente para este pedido.");
                        System.out.println("Por favor tente novamente.");
                        menu.mostraOpcoes();
                        pedirNumeroDoPedido();
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 1.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else {
                        display.mostraAgradecimentoParaPrepararPedido();
                    }
                    break;

                case 2:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 1.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 2.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 0.50");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 3) {
                        display.mostraAgradecimentoParaPrepararPedido();
                    }
                    break;

                case 3:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 4.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 5.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 3.50");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 3) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 3.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    }
                    break;

                case 4:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 9.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 10.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 8.50");
                        display.mostraAgradecimentoParaPrepararPedido();
                    } else if (numeroPedido == 3) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 8.00");
                        display.mostraAgradecimentoParaPrepararPedido();
                    }
                break;
            }
        } else {
            System.out.println();
            System.out.println("Forma de pagamento inválida!");
            System.out.println("Por favor, tente novamente.");
            menu.mostraOpcoes();
            pedirNumeroDoPedido();
        }

        preparaPedido(numeroPedido);
    }

    public void preparaPedido(int numeroPedido) {

        switch (numeroPedido) {

            case 2:
                try {
                    System.out.println();
                    System.out.println("Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Despejando a água quente no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 3:
                try {
                    System.out.println();
                    System.out.println("Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Despejando a água quente no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o leite...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o chocolate em pó...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando a canela em pó...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 4:
                try {
                    System.out.println();
                    System.out.println("Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá na água...");
                    Thread.sleep(3000);
                    System.out.println("Aguarde...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o chá no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            case 5:
                try {
                    System.out.println();
                    System.out.println("Fervendo a água...");
                    Thread.sleep(2000);
                    System.out.println("Colocando a água quente no copo.");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;

            default:
                try {
                    System.out.println();
                    System.out.println("Fervendo a água...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o pó do café no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Despejando a água quente no filtro...");
                    Thread.sleep(1000);
                    System.out.println("Colocando o café no copo...");
                    Thread.sleep(1000);
                    System.out.println("Adicionando o açucar...");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }
                break;
        }
        entregaPedido();
    }

    public void entregaPedido () {
        try {
            System.out.println();
            System.out.println("Seu pedido está pronto!");
            Thread.sleep(2000);
            System.out.println("Obrigado, volte sempre!");
        }
        catch (InterruptedException ex) {
            System.out.println(ex);
        }

        display.desligandoMaquina();
        maquinaDesligada();
    }

    public static void main (String[] args) {

        Maquina maquina = new Maquina();

        maquina.maquinaDesligada();
    }
}