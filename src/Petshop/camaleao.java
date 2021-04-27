public class Camaleao extends Reptil{
    public Camaleao(String nom, String cor int idad){
        setNome(nom);
        setCorPele(cor);
        setIdade(idad);
    }

    @Override
    public void camuflar_se(){
        System.out.println(getNome() + " esta se camuflando!");
    }
}