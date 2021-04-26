public class Papagaio extends Ave{

    public Papagaio(String nom, String sex, int idad){
        setNome(nom);
        setSexo(sex);
        setIdade(idad);
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Loro!Loro!Loro!Loro!Loro!Loro!Loro!Loro!Loro!Loro!");
    }

    @Override
    public void ficarComFome(){
        System.out.println("Loro quer alpiste!Loro quer alpiste! Loro quer alpiste!");
        System.out.println("Aceito um café também, sem acucar");
    }

    public void cantarHinoBrasil(){
        System.out.print("Loro vai cantar");
        System.out.println("\n");
        System.out.println("Ouviram do Ipiranga as margens plácidas");
        System.out.println("De um povo heroico o brado retumbante");
        System.out.println("E o sol da liberdade, em raios fúlgidos");
        System.out.println("Brilhou no céu da pátria nesse instante");
        System.out.println("\n");
    }
}
