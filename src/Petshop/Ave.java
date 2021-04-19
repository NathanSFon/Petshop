package Petshop;

public class Ave extends Pets{
    protected String corPena;
    protected boolean sabeVoar;
    protected int periodoGestacao;

    public Ave(String nome, String sexo, int idade) {
        super(nome, sexo, idade);
        //TODO Auto-generated constructor stub
    }
    
    public void colocarOvo() {}

    public String getCorPena() {
        return corPena;
    }
    public boolean isSabeVoar() {
        return sabeVoar;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public void setSabeVoar(boolean sabeVoar) {
        this.sabeVoar = sabeVoar;
    }
}
