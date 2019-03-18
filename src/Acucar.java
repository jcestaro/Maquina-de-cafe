public class Acucar {

    private int nivelAcucarPadrao = 3;
    private int nivelAcucarMaximo = 5;
    private int nivelAcucarMinimo = 0;
    private int numeroDaAguaQuente = 5;

    public void selecionarNivelAcucar (int nivelAcucarSelecionado, int numeroPedido) {

        if (nivelAcucarSelecionado <= nivelAcucarMaximo && nivelAcucarSelecionado >= nivelAcucarMinimo && numeroPedido != numeroDaAguaQuente) {
            System.out.println();
            System.out.println("O nível de açucar selecionado foi: " + nivelAcucarSelecionado);

        } else if (numeroPedido == numeroDaAguaQuente) {
            System.out.println();
            System.out.println("Na opção água quente não há açucar.");
        } else {
            System.out.println();
            System.out.println("Nível de açucar inválido.");
            System.out.println("O Nível de açucar será o padrão: " + getNivelAcucarPadrao());
        }
    }

    public int getNivelAcucarPadrao() {

        return nivelAcucarPadrao;
    }

    public int getNivelAcucarMaximo(){
        return nivelAcucarMaximo;
    }

    public int getNivelAcucarMinimo(){
        return nivelAcucarMinimo;
    }
}