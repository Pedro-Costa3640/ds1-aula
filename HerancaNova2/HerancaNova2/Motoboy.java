
package HerancaNova2;

import java.time.LocalDate;

//extends para ligar a classe atual com a principal
public class Motoboy extends Funcionario{
    
    private String placaDeMoto;

    // função construct da classe principal com a classe atual
    public Motoboy(String placaDeMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    // função get - trazendo o valor get
    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    public void getPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    // função to String - para facilitar o que será exibido na tela
    @Override
    public String toString() {
        return super.toString() +
                "\n Placa De Moto: " + placaDeMoto;
    }
    
    
    
}
