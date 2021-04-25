public class Gato extends Mamifero{
    public Gato(String nom, String sex, int idad){
        setNome(nom);
        setSexo(sex);
        setIdade(idad);
    }

    @Override
    public void emitirSom(){
        System.out.println("miau!miau!miau!miau!miau!");
    }
}
