
package HerancaNova2;

public enum Genero {
    //atributos de enum
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    // atributo para reconhecer o string ou valor inserido ao lado dos atributos acima
    protected String sexo;

    // função construct
    private Genero(String sexo) {
        this.sexo = sexo;
    }

    // função get permite que esses itens sejam chamados para outras classes
    public String getSexo() {
        return sexo;
    }
    
    
    
    
}
