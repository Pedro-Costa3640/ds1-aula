package HerancaNova2;

import java.time.LocalDate;

public abstract class Funcionario {
    
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;
    protected LocalDate dataAdmissao;

    public Funcionario(String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.dataAdmissao = dataAdmissao;
    }
    
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

    @Override
    public String toString() {
        return 
                "\n Nome: " + nome + 
                "\n CPF: " + cpf + 
                "\n RG: " + rg + 
                "\n Gênero: " + genero.getSexo() + 
                "\n Setor: " + setor.getNome() + 
                "\n Salário Base: " + salarioBase + 
                "\n Data de Admissão: " + dataAdmissao +
                "Salário Final: " + getSalarioFinal();
        
    }
    
    
    
}
