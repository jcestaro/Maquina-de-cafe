import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Maquina maquina = new Maquina();
        Opcoes opcoes = new Opcoes();
        Acucar acucar = new Acucar();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Bem-vindo a Máquina de Café." + "\n");

        opcoes.mostraOpcoes();

        int numeroPedido = scanner.nextInt();
        maquina.selecionarPedido(numeroPedido);

        int opcaoSelecionada = scanner.nextInt();
        maquina.confirmarPedido(opcaoSelecionada);

        int nivelAcucarSelecionado = scanner.nextInt();

        acucar.selecionarNivelAcucar(nivelAcucarSelecionado, numeroPedido);

        maquina.opcoesCobrarPedido();

        int dinheiro = scanner.nextInt();
        maquina.cobrarPedido(dinheiro, numeroPedido);

        maquina.preparaPedido(numeroPedido);

        maquina.entregaPedido(numeroPedido);
    }
}
