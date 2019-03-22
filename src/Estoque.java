public class Estoque {

    Ingrediente ingredientes = new Ingrediente();
    private int limiteEstoquePoDeCafe = 5;
    private int quantidadeAtualPoDeCafe;

    private int limiteEstoqueChocolate = 3;
    private int quantidadeAtualChocolate;

    private int limiteEstoqueLeiteEmPo = 5;
    private int quantidadeAtualLeiteEmPo;

    private int limiteEstoqueChaDeLimao = 2;
    private int quantidadeAtualChaDeLimao;

    private String copo = "Copo";
    private int limiteEstoqueCopo = 20;
    private int quantidadeAtualCopo;

    public String getCopo() {
        return copo;
    }

    public int getLimiteEstoquePoDeCafe() {
        return limiteEstoquePoDeCafe;
    }

    public int getLimiteEstoqueChocolate() {
        return limiteEstoqueChocolate;
    }

    public int getLimiteEstoqueChaDeLimao() {
        return limiteEstoqueChaDeLimao;
    }

    public int getLimiteEstoqueCopo() {
        return limiteEstoqueCopo;
    }

    public int getLimiteEstoqueLeiteEmPo() {
        return limiteEstoqueLeiteEmPo;
    }

    public int getQuantidadeAtualPoDeCafe() {
        return quantidadeAtualPoDeCafe;
    }

    public int getQuantidadeAtualChocolate() {
        return quantidadeAtualChocolate;
    }

    public int getQuantidadeAtualChaDeLimao() {
        return quantidadeAtualChaDeLimao;
    }

    public int getQuantidadeAtualLeiteEmPo() {
        return quantidadeAtualLeiteEmPo;
    }

    public int getQuantidadeAtualCopo() {
        return quantidadeAtualCopo;
    }

    public void setQuantidadeAtualPoDeCafe(int quantidadeAtualPoDeCafe) {
        if (quantidadeAtualPoDeCafe <= getLimiteEstoquePoDeCafe() && quantidadeAtualPoDeCafe + this.quantidadeAtualPoDeCafe <= getLimiteEstoquePoDeCafe()) {
            this.quantidadeAtualPoDeCafe += quantidadeAtualPoDeCafe;
        } else {
            System.out.println("Quantidade de " + ingredientes.getPoDeCafe() + " abastecida inválida.");
            System.out.println();
            System.out.println("Por favor reabasteça entre 0 e " + getLimiteEstoquePoDeCafe() + " Unidades.");
        }
    }
    public void setQuantidadeAtualChocolate(int quantidadeAtualChocolate) {
        if (quantidadeAtualChocolate <= getLimiteEstoqueChocolate() && quantidadeAtualChocolate + this.quantidadeAtualChocolate <= getLimiteEstoqueChocolate()) {
            this.quantidadeAtualChocolate += quantidadeAtualChocolate;
        } else {
            System.out.println("Quantidade de " + ingredientes.getChocolate() + " abastecida inválida.");
            System.out.println();
            System.out.println("Por favor reabasteça entre 0 e " + getLimiteEstoqueChocolate() + " Unidades.");
        }
    }

    public void setQuantidadeAtualChaDeLimao(int quantidadeAtualChaDeLimao) {
        if (quantidadeAtualChaDeLimao <= getLimiteEstoqueChaDeLimao() && quantidadeAtualChaDeLimao + this.quantidadeAtualChaDeLimao <= getLimiteEstoqueChaDeLimao()){
            this.quantidadeAtualChaDeLimao += quantidadeAtualChaDeLimao;
        } else {
            System.out.println("Quantidade de " + ingredientes.getChaDeLimao() + " abastecida inválida.");
            System.out.println();
            System.out.println("Por favor reabasteça entre 0 e " + getLimiteEstoqueChaDeLimao() + " Unidades.");
        }
    }

    public void setQuantidadeAtualLeiteEmPo(int quantidadeAtualLeiteEmPo) {
        if (quantidadeAtualLeiteEmPo <= getLimiteEstoqueLeiteEmPo() && quantidadeAtualLeiteEmPo + this.quantidadeAtualLeiteEmPo <= getLimiteEstoqueLeiteEmPo()){
            this.quantidadeAtualLeiteEmPo += quantidadeAtualLeiteEmPo;
        } else {
            System.out.println("Quantidade de " + ingredientes.getLeiteEmPo() + " abastecida inválida.");
            System.out.println();
            System.out.println("Por favor reabasteça entre 0 e " + getLimiteEstoqueLeiteEmPo() + " Unidades.");
        }
    }

    public void setQuantidadeAtualCopo(int quantidadeAtualCopo) {
        if (quantidadeAtualCopo <= getLimiteEstoqueCopo() && quantidadeAtualCopo + this.quantidadeAtualCopo <= getLimiteEstoqueCopo()) {
            this.quantidadeAtualCopo += quantidadeAtualCopo;
        } else {
            System.out.println("Quantidade de " + getCopo() + " abastecida inválida.");
            System.out.println();
            System.out.println("Por favor reabasteça entre 0 e " + getLimiteEstoqueCopo() + " Unidades.");
        }
    }
}
