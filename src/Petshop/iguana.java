public class Iguana extends Reptil{
    public Iguana(String nom, String cor int idad){
        setNome(nom);
        setCorPele(cor);
        setIdade(idad);
    }

    @Override
    public void trocar_pele(){
        System.out.println(getNome() + " esta trocando de pele!");
    }
}