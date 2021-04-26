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

    @Override
    public void comer(){
        System.out.println("Comendo racao");
        System.out.println("Mais meu humano");
    }

    @Override 
    public void ficarComFome(){
        System.out.println("Derruba a xicara de café do humano(a)");
        System.out.println("Melhor colocar comida");
    }
}
