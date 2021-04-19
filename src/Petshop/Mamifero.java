package Petshop;

public class Mamifero extends Pets{
    protected String corPelo;
    protected int periodoGestacao;

    public Mamifero(String nome, String corpelo, int idade) {
        super(nome, sexo, idade);
        //TODO Auto-generated constructor stub
    }

    public void amamentar() {}

    public String getCorPelo() {
        return corPelo;
    }
    public int getPeriodoGestacao() {
        return periodoGestacao;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public void setPeriodoGestacao(int periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }
}
