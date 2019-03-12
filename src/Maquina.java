import java.util.Scanner;

public class Maquina {

    public static void main (String[] args) {
        Opcoes opcoes = new Opcoes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Bem-vindo a Máquina de Café." + "\n");
        System.out.println("Essas são suas opções: \n"
                + "1. " + opcoes.getCafe() + " - R$ " + opcoes.getPrecoCafe() + "\n"
                + "2. " + opcoes.getCafeComLeite() + " - R$ " + opcoes.getPrecoCafeComLeite() + "\n"
                + "3. " + opcoes.getCapuccino() + " - R$ " + opcoes.getPrecoCapuccino() + "\n"
                + "4. " + opcoes.getCha() + " - R$ " + opcoes.getPrecoCha() + "\n"
                + "5. " + opcoes.getAguaQuente() + " - R$ " + opcoes.getPrecoAguaQuente() + "\n");

        System.out.println("O que deseja? Digite o número referente ao seu pedido." + "\n");

        // INICIO DO MÉTODO SELECIONAR PEDIDO

        int numeroPedido = scanner.nextInt();

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


        int opcaoSelecionada = scanner.nextInt();

        switch (opcaoSelecionada) {

            case 1:
                System.out.println("\n" + "Por favor selecione o nível de Açucar, de 1 a 5." + "\n");
                break;

            case 2:
                System.out.println("\n" + "Obrigado, volte sempre!");
                break;

            default:
                System.out.println("\n" + "Obrigado, volte sempre!");
        }

        int nivelAcucarSelecionado = scanner.nextInt();
        int nivelAcucarAguaQuente = 0;
        int nivelAcucarPadrao = 3;

        if (nivelAcucarSelecionado <= 5 && nivelAcucarSelecionado >= 1 && numeroPedido != 5) {

            System.out.println("\n" + "O nível de açucar selecionado foi: " + nivelAcucarSelecionado);

        } else if (numeroPedido == 5) {

            System.out.println("\n" + "Na opção água quente não há açucar.");
        } else {

            System.out.println("\n" + "Nível de açucar inválido.");
            System.out.println("O Nível de açucar será o padrão: " + nivelAcucarPadrao);
        }

        // FIM DO MÉTODO SELECIONAR PEDIDO

        // COMEÇO DO MÉTODO COBRAR PEDIDO

        System.out.println("\n" + "Por favor escolha o valor para o pagamento." + "\n"
                + "\n" + "1. " + "R$ 1.00"
                + "\n" + "2. " + "R$ 2.00"
                + "\n" + "3. " + "R$ 5.00"
                + "\n" + "4. " + "R$ 10.00" + "\n");

        int cobrar = scanner.nextInt();

        switch (cobrar) {

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

        // FIM DO MÉTODO COBRAR PEDIDO

        // INICIO DO MÉTODO PREPARAR PEDIDO


    }
}

