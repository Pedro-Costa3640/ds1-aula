
package HerancaNova2;

import java.time.LocalDate;

public class Motoboy extends Funcionario{
    
    private String placaDeMoto;

    public Motoboy(String placaDeMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }
    
    

    public void getPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Placa De Moto: " + placaDeMoto;
    }
    
    
    
}
