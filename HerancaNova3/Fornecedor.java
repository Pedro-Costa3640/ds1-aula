
package HerancaNova3;

public class Fornecedor extends Juridica{
    
    private String produto;

    public Fornecedor(String produto, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n\n Fornecedor = " + 
                "\n Produto: " + produto;
    }
    
}
