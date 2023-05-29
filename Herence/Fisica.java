package Herence;

import java.time.LocalDate;
import java.time.Period;

public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    public Fisica(String nome, String telefone, String cpf, String rg, LocalDate dataNascimento) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getIdade() {
        return Period.between(this.dataNascimento,LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return
                "\n Nome: " + nome +
                "\n Idade: " + getIdade() +
                "\n Telefone: " + telefone +
                "\n CPF: " + cpf +
                "\n RG: " + rg +
                "\n Data Nascimento: " + dataNascimento;
    }
}
