import java.util.InputMismatchException;
import java.util.Scanner;

public class Maquina {

    Menu menu = new Menu();
    Estoque estoque = new Estoque();
    Ingrediente ingredientes = new Ingrediente();
    Acucar acucar = new Acucar();
    Display display = new Display();
    Receita receita = new Receita();
    Scanner scanner = new Scanner(System.in);
    private int numeroMaximoOpcoesDeCobranca = 4;
    private int numeroMinimoOpcoesDeCobranca = 1;
    private int opcaoAbrirCompartimento = 1;
    private int opcaoFecharCompartimento = 1;
    private int opcaoLigarMaquina = 2;


    public void quantidadeAtualEstoque (){
        System.out.println(ingredientes.getPoDeCafe() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualPoDeCafe());
        System.out.println(ingredientes.getChocolate() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChocolate());
        System.out.println(ingredientes.getLeiteEmPo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualLeiteEmPo());
        System.out.println(ingredientes.getChaDeLimao() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChaDeLimao());
        System.out.println(estoque.getCopo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualCopo());
        System.out.println(acucar.getAcucar() + ", Quantidade atual disponível: " + acucar.getQuantidadeAtualAcucar());
    }

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
        System.out.println("1. " + ingredientes.getPoDeCafe() + ", Maximo de unidades: " + estoque.getLimiteEstoquePoDeCafe());
        System.out.println("2. " + ingredientes.getChocolate() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChocolate());
        System.out.println("3. " + ingredientes.getLeiteEmPo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueLeiteEmPo());
        System.out.println("4. " + ingredientes.getChaDeLimao() + ", Maximo de unidades: " + estoque.getLimiteEstoqueChaDeLimao());
        System.out.println("5. " + estoque.getCopo() + ", Maximo de unidades: " + estoque.getLimiteEstoqueCopo());
        System.out.println("6. " + acucar.getAcucar() + ", Maximo de unidades: " + ingredientes.acucar.getLimiteEstoqueAcucar());
        System.out.println();

        int numeroDoIngredienteParaReabastecer = scanner.nextInt();
        abastecerItemEscolhido(numeroDoIngredienteParaReabastecer);
    }

    public void maquinaDesligada () {
        display.mostraMaquinaDesligada();
        quantidadeAtualEstoque();

        try {
            int selecionarOpcao = scanner.nextInt();

            if (selecionarOpcao == opcaoAbrirCompartimento) {
                escolherItemParaReabastecer();
            } else if (selecionarOpcao == opcaoLigarMaquina) {
                menu.mostraOpcoes();
                pedirNumeroDoPedido();
            } else {
                maquinaDesligada();
            }
        } catch (InputMismatchException ex){
            if (!scanner.hasNextInt()) {
                System.out.println("Opção inválida.");
                System.out.println();
                System.out.println("A Máquina foi desligada.");
                scanner.next();
                maquinaDesligada();
            }
        }
    }

    public void FecharCompartimentoOuContinuarAbastecendo () {

        display.mostraFecharCompartimentoOuContinuarAbastecendo();

        int selecionarOpcao = scanner.nextInt();

        if (selecionarOpcao == opcaoFecharCompartimento){
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
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualCopo() != 0) {
                    System.out.println();
                    System.out.println("Você selecionou: " + menu.getCafe());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
                break;

            case 2:
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualLeiteEmPo() != 0
                        && estoque.getQuantidadeAtualCopo() != 0) {
                    System.out.println();
                    System.out.println("Você selecionou: " + menu.getCafeComLeite());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
                break;

            case 3:
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualLeiteEmPo() != 0
                        && estoque.getQuantidadeAtualCopo() != 0
                        && estoque.getQuantidadeAtualChocolate() != 0) {

                    System.out.println();
                    System.out.println("Você selecionou: " + menu.getCapuccino());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
                break;
            case 4:
                if (estoque.getQuantidadeAtualChaDeLimao() != 0
                        && estoque.getQuantidadeAtualCopo() != 0) {
                    System.out.println();
                    System.out.println("Você selecionou: " + menu.getCha());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
                break;

            case 5:
                if (estoque.getQuantidadeAtualCopo() != 0) {
                    System.out.println();
                    System.out.println("Você selecionou: " + menu.getAguaQuente());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
                break;

            default:
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualCopo() != 0) {
                    System.out.println();
                    System.out.println("Você não selecionou nenhuma opção válida, portanto a opção padrão é: "
                            + menu.getCafe());
                    display.mostraPerguntaDeConfirmacaoDoPedido();
                } else {
                    display.mostraMensagemEstoqueInsuficiente();
                    maquinaDesligada();
                }
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
        if (acucar.getQuantidadeAtualAcucar() > 1 * nivelAcucarSelecionado) {
            acucar.selecionarNivelAcucar(nivelAcucarSelecionado, numeroDoPedido);
            opcoesCobrarPedido(numeroDoPedido, nivelAcucarSelecionado);
        } else {
            display.mostraMensagemEstoqueInsuficiente();
            maquinaDesligada();
        }
    }

    public void opcoesCobrarPedido (int numeroDoPedido, int nivelAcucarSelecionado){
        display.mostraOpcoesParaCobrarPedido();
        int dinheiro = scanner.nextInt();
        cobrarPedido(dinheiro, numeroDoPedido, nivelAcucarSelecionado);
    }

    public void cobrarPedido (int dinheiro, int numeroPedido, int nivelAcucarSelecionado) {

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
                    }
                    break;

                case 2:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 1.00");
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 2.00");
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 0.50");
                    }
                    break;

                case 3:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 4.00");
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 5.00");
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 3.50");
                    } else if (numeroPedido == 3) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 3.00");
                    }
                    break;

                case 4:
                    if (numeroPedido == 1 || numeroPedido == 4) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 9.00");
                    } else if (numeroPedido == 5) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 10.00");
                    } else if (numeroPedido == 2) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 8.50");
                    } else if (numeroPedido == 3) {
                        System.out.println();
                        System.out.println("Seu troco é: R$ 8.00");
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

        preparaPedido(numeroPedido, nivelAcucarSelecionado);
    }

    public void preparaPedido(int numeroPedido, int nivelAcucarSelecionado) {

        switch (numeroPedido) {

            case 2:
                display.mostraAgradecimentoParaPrepararPedido();
                estoque.setQuantidadeAtualPoDeCafe(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualLeiteEmPo(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualCopo(receita.consumoDeIngrediente);
                acucar.setQuantidadeAtualAcucar(receita.consumoDeIngrediente * nivelAcucarSelecionado);
                receita.receitaDeCafeComLeite();
                entregaPedido();
                break;

            case 3:
                display.mostraAgradecimentoParaPrepararPedido();
                estoque.setQuantidadeAtualPoDeCafe(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualLeiteEmPo(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualCopo(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualChocolate(receita.consumoDeIngrediente);
                acucar.setQuantidadeAtualAcucar(receita.consumoDeIngrediente * nivelAcucarSelecionado);

                receita.receitaDeCappucino();
                entregaPedido();
                break;

            case 4:
                display.mostraAgradecimentoParaPrepararPedido();
                estoque.setQuantidadeAtualChaDeLimao(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualCopo(receita.consumoDeIngrediente);
                acucar.setQuantidadeAtualAcucar(receita.consumoDeIngrediente * nivelAcucarSelecionado);

                receita.receitaDeCha();
                entregaPedido();
                break;

            case 5:
                display.mostraAgradecimentoParaPrepararPedido();
                estoque.setQuantidadeAtualCopo(receita.consumoDeIngrediente);

                receita.receitaDeAguaQuente();
                entregaPedido();
                break;

            default:
                display.mostraAgradecimentoParaPrepararPedido();
                estoque.setQuantidadeAtualPoDeCafe(receita.consumoDeIngrediente);
                estoque.setQuantidadeAtualCopo(receita.consumoDeIngrediente);
                acucar.setQuantidadeAtualAcucar(receita.consumoDeIngrediente * nivelAcucarSelecionado);

                receita.receitaDeCafe();
                entregaPedido();
                break;
        }
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