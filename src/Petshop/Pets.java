package Petshop;

public class Pets {
    protected static String sexo;
    protected double peso;
    protected String nome;
    protected int idade;

    public Pets(String nome, String sexo, int idade){
        this.setNome(nome);
        this.setsexo(sexo);
        this.setIdade(idade);
    }

    public void comer(){}
    public void ficarComFome(){}
    
    public void emitirSom() {
        System.out.println("Aqui é escrito o som que o Pet faz");
    }

    public String getsexo() {
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
    public void setsexo(String sexo) {
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
