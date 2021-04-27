public class Cascudinho extends Peixe{
    public Cachorro(String nom, String cor int idad){
        setNome(nom);
        setCorEscama(cor);
        setIdade(idad);
    }

    @Override
    public void limpa_vidro(){
        System.out.println(getNome() + " esta se alimentando de algas no vidro do aquário");
    }
}