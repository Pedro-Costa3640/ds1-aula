 
package HerancaNova3;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua", "25", "Próximo a rua", "41165-555", "Salvador", UnidadeFederativa.BAHIA);
        
        Fornecedor fornecedor = new Fornecedor("Pistola", "1564.4564.4444", "123456", 1, "Cruela", "(71)98888-8888", "csa@gmail.com", endereco);
        
        PrestacaoSevico servico = new PrestacaoSevico(LocalDate.of(1999, Month.MARCH, 20), LocalDate.of(2020, Month.MARCH, 3), 
                "1564.4564.4444", "717171", 6, "UBJ UbersJ", "(71)98888-8888", "csa@gmail.com", endereco);
        
        Cliente cliente = new Cliente(90, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 20), 2, "Iraci", "(71)98888-8888", "csa@gmail.com", endereco);
        
        Engenheiro engenheiro = new Engenheiro("12345", "123.456.789-10", "1234.4567.7895", "71111", Setor.ENGENHARIA, 4000, Genero.MASCULINO, 
                EstadoCivil.CASADO, LocalDate.of(1999, Month.MARCH, 10), 3, "Caíque", "(71)98888-8888", "csa@gmail.com", endereco);
        
        Advogado advogado = new Advogado("101010", "123.456.789-10", "1234.4567.7895", "72222", Setor.JURIDICO, 7000, Genero.MASCULINO, 
                EstadoCivil.VIUVO, LocalDate.of(2000, Month.MARCH, 11), 4, "Miraldo", "(71)98888-8888", "csa@gmail.com", endereco);
        
        Medico medico = new Medico("556666", "123.456.789-10", "1234.4567.7895", "73333", Setor.SAUDE, 10000, Genero.FEMININO, 
                EstadoCivil.SOLTEIRO, LocalDate.of(1999, Month.MARCH, 20), 5, "Lourraine", "(71)98888-8888", "csa@gmail.com", endereco);
        
        System.out.println("Informações: ");
        System.out.println("Fornecedor: ");
        System.out.println(fornecedor.toString());
        
        System.out.println("Prestação de Serviço: ");
        System.out.println(servico.toString());
        
        System.out.println("Cliente: ");
        System.out.println(cliente.toString());
        
        System.out.println("Engenheiro: ");
        System.out.println(engenheiro.toString());
        
        System.out.println("Advogado: ");
        System.out.println(advogado.toString());
        
        System.out.println("Médico: ");
        System.out.println(medico.toString());
        
       
        
        
        
    }
    
}
