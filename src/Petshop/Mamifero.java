
public class Mamifero extends Pets{
    protected String corPelo;
    protected int periodoGestacao;
    protected boolean gestante;

    public void amamentar() {
        if (sexo == "femea" || sexo == "F"){
            if(isGestante()){
                System.out.println(getNome() + " está amamentando");
            }
        } else{
            System.out.println("este animal não amamenta");
        }
    }

    public void detalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Cor do pelo: " + getCorPelo() + "\n");

    }

    public String getCorPelo() {
        return corPelo;
    }
    public int getPeriodoGestacao() {
        return periodoGestacao;
    }
    public boolean isGestante() {
        return gestante;
    }
    public void setGestante(boolean gestante) {
        this.gestante = gestante;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    public void setPeriodoGestacao(int periodoGestacao) {
        this.periodoGestacao = periodoGestacao;
    }
}
