public class Empregado {
    private String nome; //encapsulado
    private int idade;  // encapsulado
    //camel case
    public void setNome (String nome) { //essa variavel
        this.nome = nome; // esse varivael recebe o valor daquela variavel. 
    }

    public String getNome () {
        return this.nome;
    }

    
    public void setIdade (int idade) {
        this.idade = idade;
    }

    public int getIdade () {
        return this.idade;
    }
}