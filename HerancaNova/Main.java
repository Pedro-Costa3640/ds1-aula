package HerancaNova;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
    Fisica fisica = new Fisica(Genero.FEMININO, "123.456.789-10", "1234.4567.8910", LocalDate.of(1996, Month.MARCH, 23), 7.699, 1, "Rebeca Garcia", "(71) 98888-7777",
            new Endereco("Rua", "30", "Perto do campo", "41156-156", "Salvador", UnidadeFederativa.BAHIA));
    Juridica juridica = new Juridica("123.456.7891-10", "n123", LocalDate.of(2003, Month.JANUARY, 12), LocalDate.of(2020, Month.DECEMBER, 20), 
            4.766, 2, "Carlos Marcelo", "(71) 98888-6666", new Endereco("Condomínio", "12", "Ao lado do shopping", "12456-120", "São Paulo", UnidadeFederativa.SAO_PAULO));

        System.out.println("Informações das Pessoas: ");
        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    
    }

}
