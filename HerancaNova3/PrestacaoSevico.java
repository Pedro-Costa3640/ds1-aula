
package HerancaNova3;

import java.time.LocalDate;

public class PrestacaoSevico extends Juridica{
    
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoSevico(LocalDate contratoInicio, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\n Prestação Seviço = " + 
                "\n Contrato Inicio: " + contratoInicio + 
                "\n Contrato Fim: " + contratoFim;
    }
    
    
    
    
}
