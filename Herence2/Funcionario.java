package Herence2;

//abstract - método para representar que a classe é  a principal
abstract class Funcionario {
    //atributos e suas específicações
    protected String nome;
    protected String cpf;
    protected String rg;
    protected String salario;

    // função construtor
    public Funcionario(String nome, String cpf, String rg, String salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.salario = salario;
    }

    // função get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return "\n Nome: " + nome +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n Salário: " + salario;
    }
}
