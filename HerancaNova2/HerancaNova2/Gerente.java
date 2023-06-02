
package HerancaNova2;

import java.time.LocalDate;

//extends para ligar a classe atual com a principal
public class Gerente extends CargoDeConfianca{

    // função construct da classe principal com a classe atual
    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
    // função get - trazendo o valor get
    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * bonificacao.GERENTE.valor);
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return super.toString();
    }

    
    

    
    
    
}
