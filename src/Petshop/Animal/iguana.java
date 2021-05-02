package Animal;

public class iguana extends Reptil{
    public iguana(String nom, String cor, int idad){
        setNome(nom);
        setCorPele(cor);
        setIdade(idad);
    }

    public void trocar_pele(){
        System.out.println(getNome() + " esta trocando de pele!");
    }
}