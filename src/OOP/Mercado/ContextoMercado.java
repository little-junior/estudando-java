package OOP.Mercado;

import OOP.Mercado.Produtos.Shampoo;

public class ContextoMercado {
    public static void main(String[] args) {
        Produto shampoo = new Produto("Maxcapilar", "02-02-2002", "cosmetico", 30);
        Produto macarrao = new Produto();
        Shampoo Wella = new Shampoo();

        Wella.setDescricaoShampoo("Recomendado para descolorir cabelo");

        System.out.println(Wella.getQuantidadeEmEstoqueProduto());
        System.out.println(Wella.getDescricaoShampoo());


    }
}
