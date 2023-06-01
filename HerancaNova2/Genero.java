
package HerancaNova2;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    protected String sexo;

    private Genero(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
    
    
    
    
}
