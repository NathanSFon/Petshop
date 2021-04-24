package Petshop;

public class Cachorro extends Mamifero{

    public Cachorro(String nome, String corpelo, int idade) {
        super(nome, sexo, idade);
    }

    public void emitirSom(){
        System.out.println("auauauauuauauaau!");
    }
}
