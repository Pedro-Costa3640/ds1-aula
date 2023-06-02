
package HerancaNova2;

import java.time.LocalDate;

//extends para ligar a classe atual com a principal
public class Diretor extends CargoDeConfianca{
    // dando valor a atributo
    protected final double PREMIO = 0.1 ;

    // função construct da classe principal com a classe atual
    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }
    
    
    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return super.toString() + 
                "\n Prêmio de: " + PREMIO;
    }

    // função get - trazendo o valor get
    @Override
    public double getSalarioFinal() {
        return (salarioBase + salarioBase * PREMIO * bonificacao.DIRETOR.valor);
    }
    
    
    
}
