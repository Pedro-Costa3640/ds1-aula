package HerancaNova2;

// import - para poder utilizar recursos específicos
import java.time.LocalDate;
// abstract para classe primária
public abstract class Funcionario {
    // atributos e seus valores
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;
    protected LocalDate dataAdmissao;

    // função construct
    public Funcionario(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    
    // função get - para endereçar e linkar as informações
    public abstract double getSalarioFinal(); // obrigando a implementar

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public Genero getGenero() {
        return genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override // overrive - pode mudar
    public String toString() {
        return 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Gênero: " + genero.getSexo() + 
                "\n Setor: " + setor.getNome() + 
                "\n Salário Base: R$" + salarioBase + 
                "\n Data de Admissão: " + dataAdmissao +
                "\n Salário Final: R$" + getSalarioFinal();
        
    }
    
    
    
}
