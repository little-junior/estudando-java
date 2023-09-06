package OOP.Mercado.Produtos;

import OOP.Mercado.Produto;

public class Shampoo extends Produto{
    private String descricaoShampoo;

    public void setDescricaoShampoo(String descricaoShampoo){
        this.descricaoShampoo = descricaoShampoo;
    }

    public String getDescricaoShampoo(){
        return descricaoShampoo;
    }
}
