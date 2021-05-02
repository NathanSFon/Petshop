package Animal;

public class Peixe extends Pets{
    protected String corEscama;
    protected double tamanho;

    public void alimentar_se() {
        System.out.println(getNome() + " está se alimentando");
    }
    public void nadar(){
        System.out.println(getNome() + " está nadando");
    }

    public void detalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Tamanho em cm: " + getTamanho());
        System.out.println("Cor da escama: " + getCorEscama() + "\n");

    }

    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    public double getTamanho(){
        return tamanho;
    }
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    
}