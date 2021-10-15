public class Empregado {
    private String nome; //encapsulado
    private int idade;  // encapsulado
    private int tipo; //encapsulado 
    private double salario;
    private double comissao;
    private double bonus;

    public void setTipo (int tipo){
        this.tipo = tipo; 
    }

    public int getTipo (){
        return this.tipo; 
    }

    public double calculaSalario(){ //metodo
        if (tipo == 1) {
            return salario;
        }    
        else if (tipo == 2) {
            return salario + salario * comissao;
        }
        else if (tipo == 3) {
            return salario + bonus; 
        }
        return 0;
    }    
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