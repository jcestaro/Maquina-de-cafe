public class Receita {

    public void receitaDeCafe (){
        try {
            System.out.println();
            System.out.println("Fervendo a água...");
            Thread.sleep(1000);
            System.out.println("Adicionando o filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o pó de café no filtro...");
            Thread.sleep(1000);
            System.out.println("Despejando a água quente no filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o café no copo...");
            Thread.sleep(1000);
            System.out.println("Adicionando o açucar...");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void receitaDeCafeComLeite (){
        try {
            System.out.println();
            System.out.println("Fervendo a água...");
            Thread.sleep(1000);
            System.out.println("Adicionando o filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o pó de café no filtro...");
            Thread.sleep(1000);
            System.out.println("Despejando a água quente no filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o café no copo...");
            Thread.sleep(1000);
            System.out.println("Adicionando o leite em pó...");
            Thread.sleep(1000);
            System.out.println("Adicionando o açucar...");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void receitaDeCappucino (){
        try {
            System.out.println();
            System.out.println("Fervendo a água...");
            Thread.sleep(1000);
            System.out.println("Adicionando o filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o pó de café no filtro...");
            Thread.sleep(1000);
            System.out.println("Despejando a água quente no filtro...");
            Thread.sleep(1000);
            System.out.println("Colocando o café no copo...");
            Thread.sleep(1000);
            System.out.println("Adicionando o leite em pó...");
            Thread.sleep(1000);
            System.out.println("Adicionando o chocolate em pó...");
            Thread.sleep(1000);
            System.out.println("Adicionando a canela em pó...");
            Thread.sleep(1000);
            System.out.println("Adicionando o açucar...");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void receitaDeCha (){
        try {
            System.out.println();
            System.out.println("Fervendo a água...");
            Thread.sleep(1000);
            System.out.println("Colocando o chá de limão na água...");
            Thread.sleep(3000);
            System.out.println("Aguarde...");
            Thread.sleep(1000);
            System.out.println("Colocando o chá no copo...");
            Thread.sleep(1000);
            System.out.println("Adicionando o açucar...");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }

    public void receitaDeAguaQuente (){
        try {
            System.out.println();
            System.out.println("Fervendo a água...");
            Thread.sleep(2000);
            System.out.println("Colocando a água quente no copo.");
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
    }
}
