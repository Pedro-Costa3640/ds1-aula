package Herence2;

//extends seguido da classe principal - para ligar a classe principal
public class Motoboy extends Funcionario{
    //atributos e suas específicações
    private String cnh;

    // função construtor
    public Motoboy(String nome, String cpf, String rg, String salario, String cnh) {
        super(nome, cpf, rg, salario);
        this.cnh = cnh;
    }

    // função get e set
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return "\nInformações do Motoboy: "
                //super.toString - liga os atributos da classe principal
                + "\n" + super.toString() +
                "\n CNG: " + cnh;
    }
}
