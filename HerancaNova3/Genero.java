
package HerancaNova3;

public enum Genero {
    MASCULINO("Masculino",'M'),
    FEMININO("Feminino",'F');
    
    private String sexo;
    private char caracter;

    private Genero(String sexo, char caracter) {
        this.sexo = sexo;
        this.caracter = caracter;
    }

    public String getSexo() {
        return sexo;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
    
}
