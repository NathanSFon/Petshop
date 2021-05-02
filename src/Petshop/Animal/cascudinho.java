package Animal;

public class cascudinho extends Peixe{
    public cascudinho(String nom, String cor, int idad){
        setNome(nom);
        setCorEscama(cor);
        setIdade(idad);
    }

    public void limpa_vidro(){
        System.out.println(getNome() + " esta se alimentando de algas no vidro do aquário");
    }
}