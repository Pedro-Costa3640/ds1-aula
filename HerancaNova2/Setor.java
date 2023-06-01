
package HerancaNova2;

public enum Setor {
    ENGENHARIA("Enganharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    FINANCEIRO("Fincanceiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }    
    
    
}
