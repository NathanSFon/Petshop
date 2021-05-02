package Animal;

public class Reptil extends Pets{
    protected String corPele;
    protected double comprimento;

    public void alimentar_se() {
        System.out.println(getNome() + " está se alimentando");
    }
    public void mergulhar(){
        System.out.println(getNome() + " está mergulhando");
    }


    public void detalhes(){
        System.out.println("Nome: " + getNome());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Idade: " + getIdade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Comprimento: " + getComprimento());
        System.out.println("Cor da pele: " + getCorPele() + "\n");

    }

    public String getCorPele() {
        return corPele;
    }
    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    public double getComprimento(){
        return comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
}