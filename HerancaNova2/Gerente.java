
package HerancaNova2;

import java.time.LocalDate;

public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * bonificacao.GERENTE.valor);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    

    
    
    
}
