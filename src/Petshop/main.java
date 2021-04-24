package Petshop;

public class main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro("loop", "Macho", 8);
        Gato g1 = new Gato("tesli", "Femea", 1);
		Pets p1 = new Pets("Doguinho", "m", 3);

		p1.comer();
		p1.ficarComFome();
		c1.ficarComFome();
		g1.ficarComFome();
		p1.comer();
		c1.comer();
		g1.comer();
    }
}
