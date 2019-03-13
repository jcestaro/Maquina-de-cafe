public class Acucar {
    private String nivelAcucar;
    private int nivelAcucarPadrao = 3;

    public String selecionarNivelAcucar (int nivelAcucarSelecionado, int numeroPedido) {

        if (nivelAcucarSelecionado <= 5 && nivelAcucarSelecionado >= 0 && numeroPedido != 5) {

            System.out.println("\n" + "O nível de açucar selecionado foi: " + nivelAcucarSelecionado);

        } else if (numeroPedido == 5) {

            System.out.println("\n" + "Na opção água quente não há açucar.");
        } else {

            System.out.println("\n" + "Nível de açucar inválido.");
            System.out.println("O Nível de açucar será o padrão: " + getNivelAcucarPadrao());
        }

        return nivelAcucar;
    }

    public int getNivelAcucarPadrao() {

        return nivelAcucarPadrao;
    }
}