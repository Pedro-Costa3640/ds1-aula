
package HerancaNova3;

public abstract class Juridica extends Pessoa{
    
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    @Override
    public String toString() {
        return  "Pessoa Jurídica: " +
                super.toString() + 
                "\n CNPJ: " + cnpj + 
                "\n Inscrição Estadual: " + inscricaoEstadual;
    }
    
    
    
}
