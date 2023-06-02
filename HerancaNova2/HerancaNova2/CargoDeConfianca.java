
package HerancaNova2;

import java.time.LocalDate;

// abstract para classe primária e extends para ligar aos valores da classe principal
public abstract class CargoDeConfianca extends Funcionario {
    
    protected Bonificacao bonificacao;

    // função construct da classe principal com a classe atual
    public CargoDeConfianca(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.bonificacao = bonificacao;
    }

    // função get
    public Bonificacao getBonificacao() {
        return bonificacao;
    }
    
    
}
