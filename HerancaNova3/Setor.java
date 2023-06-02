
package HerancaNova3;

public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saúde"), 
    JURIDICO("Jurídico");
    
    private String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
