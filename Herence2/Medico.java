package Herence2;

//extends seguido da classe principal - para ligar a classe principal
public class Medico extends Funcionario {
    //atributos e suas específicações
    private String crm;


    // função construtor
    public Medico(String nome, String cpf, String rg, String salario, String crm) {
        super(nome, cpf, rg, salario);
        this.crm = crm;
    }

    // função get e set
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return "\nInformações do Médico: "
                //super.toString - liga os atributos da classe principal
                + "\n" + super.toString() +
                "\n Conselho Regional:" + crm ;
    }
}
