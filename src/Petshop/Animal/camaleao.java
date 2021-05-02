package Animal;

public class camaleao extends Reptil{
    public camaleao(String nom, String cor, int idad){
        setNome(nom);
        setCorPele(cor);
        setIdade(idad);
    }

    public void camuflarSe(){
        System.out.println(this.getNome() + " esta se camuflando!");
    }
}