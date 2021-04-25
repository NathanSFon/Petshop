public class main {
    public static void main(String[] args) {
       Cachorro dog = new Cachorro("Loop", "M", 8);
       Gato cat = new Gato("Tesli", "F", 2);

       dog.setCorPelo("branco");
       cat.setCorPelo("Preto&Branco");

       dog.detalhes();
       cat.detalhes();
    }
}
