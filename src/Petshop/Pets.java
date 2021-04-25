
public abstract class Pets {
    protected String sexo;
    protected double peso;
    protected String nome;
    protected int idade;

    public void comer(){
        System.out.println("Alimentado");
    }
    public void ficarComFome(){
        System.out.println("Este animal está a muito tempo sem comer");
    }
    
    public void emitirSom() {
        System.out.println("Aqui é escrito o som que o Pet faz");
    }

    public String getSexo() {
        return sexo;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
