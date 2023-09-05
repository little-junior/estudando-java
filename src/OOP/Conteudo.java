package OOP;

import OOP.TestandoDefault;


public class Conteudo{
    private String nome;
    private String anoDeLancamento;
    private String diretorNome;
    private String descricao;
    private String rate;
    private boolean visto = false;
    private int vezesVisto;

    public Conteudo(){}

    public Conteudo(String nome, String anoDeLancamento, String diretorNome, String descricao) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.diretorNome = diretorNome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getDiretorNome() {
        return diretorNome;
    }

    public void setDiretorNome(String diretorNome) {
        this.diretorNome = diretorNome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getVezesVisto(){
        return vezesVisto;
    }

    public void foiVisto(){
        this.visto = true;
        this.vezesVisto++;
    }

    public static void main(String[] args) {
        String nome1 = "Paprika";
        String anoDeLancamento1 = "2006";
        String diretorNome1 = "Satoshi Kon";
        String descricao1 = "This is your brain on anime";

        Conteudo filme1 = new Conteudo();
        Conteudo filme2 = new Conteudo();
        filme2.setNome("Tropa de Elite");
        filme2.setAnoDeLancamento("2008");
        filme2.setDiretorNome("Leandro Assusuna");
        filme2.setDescricao("OSSO DURO DE ROER");
        Conteudo filme3 = new Conteudo(nome1, anoDeLancamento1, diretorNome1, descricao1);

        System.out.println(filme1.getNome());
        System.out.println(filme2.getNome());
        System.out.println(filme3.getNome());
    }
}
