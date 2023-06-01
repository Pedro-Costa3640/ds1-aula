
package HerancaNova2;

import java.time.LocalDate;

public class Diretor extends CargoDeConfianca{

    protected final double PREMIO = 0.1 ;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
    
    @Override
    public String toString() {
        return super.toString() + 
                "\n Prêmio: " + PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * PREMIO * bonificacao.DIRETOR.valor);
    }
    
    
    
}
