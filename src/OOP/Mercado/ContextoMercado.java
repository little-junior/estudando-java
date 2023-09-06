package OOP.Mercado;

public class ContextoMercado {
    public static void main(String[] args) {
        Produto shampoo = new Produto("Maxcapilar", "02-02-2002", "cosmetico", 30);
        Produto macarrao = new Produto();

        System.out.println(shampoo.getNomeProduto());
        System.out.println(macarrao.getNomeProduto());

        shampoo.setNomeProduto("Capigel");
        System.out.println(shampoo.getNomeProduto());

        System.out.println(shampoo.mostrarResumoProduto());
        System.out.println(macarrao.mostrarResumoProduto());

        System.out.println(OOP.getName());

    }
}
