package Herence;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

         Fisica fisica = new Fisica("Laura","(71) 94002-8922","444.555.666-56","4565.5466.6455", LocalDate.of(1999, Month.AUGUST,20));
         Juridica juridica = new Juridica("Mário","(71) 94002-8922","565.5454.555-45","123456789");

        System.out.println("Pessoa Física: ");
        System.out.println(fisica.toString());
        System.out.println("\n Pessoa Jurídica: ");
        System.out.println(juridica.toString());

    }

}
