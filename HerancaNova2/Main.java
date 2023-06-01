
package HerancaNova2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("KCT6910", "Ricardo", "123.456.789-10", "1230.4456.7899", Genero.MASCULINO, Setor.OPERACOES, 1300, LocalDate.of(2022, Month.JANUARY, 10));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Rodrigo", "123.456.789-10", "1230.4456.7899", Genero.MASCULINO, Setor.FINANCEIRO, 4500, LocalDate.of(2002, Month.MARCH, 20));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Aurora", "123.456.789-10", "1230.4456.7899", Genero.FEMININO, Setor.ADMINISTRATIVO, 7850, LocalDate.of(2010, Month.MARCH, 20));
        
        System.out.println("Informações do Motoboy: ");
        System.out.println(motoboy.toString());
        System.out.println("\n\n Informações do Gerente: ");
        System.out.println(gerente.toString());
        System.out.println("\n\n Informações do Diretor: ");
        System.out.println(diretor.toString());
        
        
    }
    
}

