public class Menu {
    private String cafe = "Café";
    private String cafeComLeite = "Café com Leite";
    private String capuccino = "Capuccino";
    private String cha = "Chá";
    private String aguaQuente = "Água Quente";
    private double precoCafe = 1.00;
    private double precoCafeComLeite = 1.50;
    private double precoCapuccino = 2.00;
    private double precoCha = 1.00;
    private int precoAguaQuente = 0;
    private String menuOpcoes;

    public String mostraOpcoes() {
        System.out.println("Essas são suas opções: \n"
                + "1. " + getCafe() + " - R$ " + getPrecoCafe() + "\n"
                + "2. " + getCafeComLeite() + " - R$ " + getPrecoCafeComLeite() + "\n"
                + "3. " + getCapuccino() + " - R$ " + getPrecoCapuccino() + "\n"
                + "4. " + getCha() + " - R$ " + getPrecoCha() + "\n"
                + "5. " + getAguaQuente() + " - R$ " + getPrecoAguaQuente() + "\n");

        System.out.println("Digite o número referente ao seu pedido." + "\n");
        return menuOpcoes;
    }

    public String getCafe() {
        return cafe;
    }

    public String getCafeComLeite() {
        return cafeComLeite;
    }

    public String getCapuccino() {
        return capuccino;
    }

    public String getAguaQuente() {
        return aguaQuente;
    }

    public String getCha() {
        return cha;
    }

    public double getPrecoCafe() {
        return precoCafe;
    }

    public double getPrecoCafeComLeite() {
        return precoCafeComLeite;
    }

    public double getPrecoCapuccino() {
        return precoCapuccino;
    }

    public double getPrecoCha() {
        return precoCha;
    }

    public int getPrecoAguaQuente() {
        return precoAguaQuente;
    }
}