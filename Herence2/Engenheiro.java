package Herence2;

//extends seguido da classe principal - para ligar a classe principal
public class Engenheiro extends Funcionario {
    //atributos e suas específicações
    private String crea;

    // função construtor
    public Engenheiro(String nome, String cpf, String rg, String salario, String crea) {
        super(nome, cpf, rg, salario);
        this.crea = crea;
    }

    // função get e set
    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return "\nInformações do Engenheiro: "
                //super.toString - liga os atributos da classe principal
                + "\n" + super.toString() +
                "\n Crea:" + crea;
    }
}
