package OOP.Mercado;

public class Produto {
    private String nomeProduto;
    private String dataDeValidadeProduto;
    private String tipoProduto;
    private int quantidadeEmEstoqueProduto;

    public Produto(){}

    public Produto(String nomeProduto, String dataDeValidadeProduto, String tipoProduto, int quantidadeEmEstoqueProduto){
        this.nomeProduto = nomeProduto;
        this.dataDeValidadeProduto = dataDeValidadeProduto;
        this.tipoProduto = tipoProduto;
        this.quantidadeEmEstoqueProduto = quantidadeEmEstoqueProduto;

    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto){
        this.nomeProduto = nomeProduto;
    }

    public String getDataDeValidadeProduto(){
        return dataDeValidadeProduto;
    }

    public void setDataDeValidadeProduto(String dataDeValidadeProduto){
        this.dataDeValidadeProduto = dataDeValidadeProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public int getQuantidadeEmEstoqueProduto() {
        return quantidadeEmEstoqueProduto;
    }

    public void setQuantidadeEmEstoqueProduto(int quantidadeEmEstoqueProduto) {
        this.quantidadeEmEstoqueProduto = quantidadeEmEstoqueProduto;
    }

    public String mostrarResumoProduto(){
        return "O produto " + nomeProduto + " tem data de validade " + dataDeValidadeProduto + ", é do tipo " +
                tipoProduto + " e possui " + quantidadeEmEstoqueProduto + " em estoque";
    }
}
