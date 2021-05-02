import Animal.*;

public class main {
    public static void main(String[] args) {
       Cachorro dog = new Cachorro("Loop", "M", 8);
       Gato cat = new Gato("Tesli", "F", 2);
       Papagaio rosa = new Papagaio("Loro", "F", 6);

       dog.setCorPelo("branco");
       cat.setCorPelo("Preto&Branco");
       rosa.setCorPena("verde e azul");

       dog.detalhes();
       cat.detalhes();
       rosa.detalhes();

       rosa.cantarHinoBrasil();
    }
}
