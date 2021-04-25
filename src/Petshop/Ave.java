
public class Ave extends Pets{
    protected String corPena;
    protected boolean sabeVoar;
    protected int periodoGestacao;
    protected boolean gestante;

    public void colocarOvo() {
        if (sexo == "femea" || sexo == "F"){
            if(isGestante()){
                System.out.println(getNome() + " colocou um ovo");
            }
        } else{
            System.out.println("este animal pode colocar um ovo");
        }
    }

    public String getCorPena() {
        return corPena;
    }
    public boolean isSabeVoar() {
        return sabeVoar;
    }
    public boolean isGestante() {
        return gestante;
    }
    public int getPeriodoGestacao() {
        return periodoGestacao;
    }
    public void setPeriodoGestacao(int periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }
    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    public void setSabeVoar(boolean sabeVoar) {
        this.sabeVoar = sabeVoar;
    }
}
