
package HerancaNova3;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String oab, String cpf, String rg, String matricula, Setor setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, id, nome, telefone, email, endereco);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "\n Advogado: " + 
                super.toString() +
                "\n OAB: " + oab;
    }
   
}