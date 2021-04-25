public class Cachorro extends Mamifero{
    public Cachorro(String nom, String sex, int idad){
        setNome(nom);
        setSexo(sex);
        setIdade(idad);
    }

    @Override
    public void emitirSom(){
        System.out.println("auauauauuauauaau!");
    }
}
