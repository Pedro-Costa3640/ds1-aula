
package HerancaNova2;

public enum Setor {
    //atributos de enum
    ENGENHARIA("Enganharia"),
    SAUDE("Saúde"),
    JURIDICO("Jurídico"),
    FINANCEIRO("Fincanceiro"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    // atributo para reconhecer o string ou valor inserido ao lado dos atributos acima
    protected String nome;

    // função construct
    private Setor(String nome) {
        this.nome = nome;
    }
    
    // função get permite que esses itens sejam chamados para outras classes
    public String getNome() {
        return nome;
    }    
    
    
}
