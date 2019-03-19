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

        try {
            int selecionarOpcao = scanner.nextInt();

            if (selecionarOpcao == 1) {
                escolherItemParaReabastecer();
            } else if (selecionarOpcao == 2) {
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
        opcoesCobrarPedido(numeroDoPedido, nivelAcucarSelecionado);
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
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualLeiteEmPo() != 0
                        && estoque.getQuantidadeAtualCopo() != 0
                        && acucar.getQuantidadeAtualAcucar() > 1 * nivelAcucarSelecionado) {

                    display.mostraAgradecimentoParaPrepararPedido();
                    estoque.setQuantidadeAtualPoDeCafe(-1);
                    estoque.setQuantidadeAtualLeiteEmPo(-1);
                    estoque.setQuantidadeAtualCopo(-1);
                    acucar.setQuantidadeAtualAcucar(-1 * nivelAcucarSelecionado);
                    receita.receitaDeCafeComLeite();
                    entregaPedido();
                }
                break;

            case 3:
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualLeiteEmPo() != 0
                        && estoque.getQuantidadeAtualCopo() != 0
                        && estoque.getQuantidadeAtualChocolate() != 0
                        && acucar.getQuantidadeAtualAcucar() > 1 * nivelAcucarSelecionado){

                    display.mostraAgradecimentoParaPrepararPedido();
                    estoque.setQuantidadeAtualPoDeCafe(-1);
                    estoque.setQuantidadeAtualLeiteEmPo(-1);
                    estoque.setQuantidadeAtualCopo(-1);
                    estoque.setQuantidadeAtualChocolate(-1);
                    acucar.setQuantidadeAtualAcucar(-1 * nivelAcucarSelecionado);

                    receita.receitaDeCappucino();
                    entregaPedido();
                }
                break;

            case 4:
                if (estoque.getQuantidadeAtualChaDeLimao() != 0
                        && estoque.getQuantidadeAtualCopo() != 0
                        && acucar.getQuantidadeAtualAcucar() > 1 * nivelAcucarSelecionado){

                    display.mostraAgradecimentoParaPrepararPedido();
                    estoque.setQuantidadeAtualChaDeLimao(-1);
                    estoque.setQuantidadeAtualCopo(-1);
                    acucar.setQuantidadeAtualAcucar(-1 * nivelAcucarSelecionado);

                    receita.receitaDeCha();
                    entregaPedido();
                }
                break;

            case 5:
                if (estoque.getQuantidadeAtualCopo() != 0) {

                    display.mostraAgradecimentoParaPrepararPedido();
                    estoque.setQuantidadeAtualCopo(-1);

                    receita.receitaDeAguaQuente();
                    entregaPedido();
                }
                break;

            default:
                if (estoque.getQuantidadeAtualPoDeCafe() != 0
                        && estoque.getQuantidadeAtualCopo() != 0
                        && acucar.getQuantidadeAtualAcucar() > 1 * nivelAcucarSelecionado) {

                    display.mostraAgradecimentoParaPrepararPedido();
                    estoque.setQuantidadeAtualPoDeCafe(-1);
                    estoque.setQuantidadeAtualCopo(-1);
                    acucar.setQuantidadeAtualAcucar(-1 * nivelAcucarSelecionado);

                    receita.receitaDeCafe();
                    entregaPedido();
                }
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

        System.out.println();
        System.out.println(ingredientes.getPoDeCafe() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualPoDeCafe());
        System.out.println(ingredientes.getChocolate() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChocolate());
        System.out.println(ingredientes.getLeiteEmPo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualLeiteEmPo());
        System.out.println(ingredientes.getChaDeLimao() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualChaDeLimao());
        System.out.println(estoque.getCopo() + ", Quantidade atual disponível: " + estoque.getQuantidadeAtualCopo());
        System.out.println(acucar.getAcucar() + ", Quantidade atual disponível: " + acucar.getQuantidadeAtualAcucar());
        System.out.println();

        display.desligandoMaquina();
        maquinaDesligada();
    }

    public static void main (String[] args) {

        Maquina maquina = new Maquina();

        maquina.maquinaDesligada();
    }
}