package Herence2;

public class Main {
    public static void main(String[] args) {
        // Classes e suas características
        Motoboy moto = new Motoboy("Richarlynson", "123.456.789-10", "1234.5678.8910", "R$ 1.300,20", "123456789");
        Engenheiro engenheiro = new Engenheiro("Caíque", "123.456.789-10", "1234.5678.8910", "R$ 3.200,00", "12345678");
        Medico medico = new Medico("Marcela", "123.456.789-10", "1234.5678.8910", "R$ 10.500,00", "1234567");

        // exibir mensagem a tela
        System.out.println("Informações dos Funcionários: ");
        // exibir informações feitas anteriormente
        System.out.println(moto.toString());
        System.out.println(engenheiro.toString());
        System.out.println(medico.toString());

    }

}
