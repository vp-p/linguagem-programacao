package application;

import entities.Bolos;
import entities.Exposicao;
import entities.Museu;

import javax.swing.*;

public class Test {
    public static void main(String[]args){

        System.out.println("==== TESTANDO BOLO ====");
        System.out.println();
        System.out.println("Assando bolo...");
        Bolos boloChocolateMorango = new Bolos("chocolate", "morango", "brigadeiro");
        System.out.println();

        System.out.println("==== TESTANDO MUSEU ====");
        System.out.println();
        Museu museu = new Museu("Museu de Arte e História de São José dos Campos", "Rua Alvaro de Pedra, 004", "09:00", "20:00");

        System.out.println("Adicionando exposições...");
        museu.adicionarExposicao(new Exposicao("Arte Moderna", "Obras do século XX"));
        museu.adicionarExposicao(new Exposicao("História Antiga", "Relíquias egípcias"));

        System.out.println("\nListando todas as exposições:");
        museu.listarExposicoes();

        System.out.println("\nRemovendo a exposição 'Arte Moderna'...");
        museu.removerExposicao("Arte Moderna");

        System.out.println("\nListando todas as exposições:");
        museu.listarExposicoes();


    }
}
