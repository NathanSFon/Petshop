package Petshop;

public class Gato extends Mamifero{
    
    public Gato(String nome, String corpelo, int idade) {
        super(nome, sexo, idade);
        //TODO Auto-generated constructor stub
    }

    public void emitirSom(){
        System.out.println("miau!miau!miau!miau!miau!");
    }
}
