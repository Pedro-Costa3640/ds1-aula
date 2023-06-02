
package HerancaNova2;

public enum Bonificacao {
    // dando valor a atributo enum
    GERENTE(0.2),
    DIRETOR(0.4);
    
    // atributo para reconhecer o string ou valor inserido ao lado dos atributos acima
    protected double valor;

    //referênciando a operação
    private Bonificacao(double valor) {
        this.valor = valor;
    }

    // função get permite que esses itens sejam chamados para outras classes
    public double getValor() {
        return valor;
    }

    
}
