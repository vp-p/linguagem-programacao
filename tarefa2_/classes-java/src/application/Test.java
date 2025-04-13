package application;

import entities.*;

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

        System.out.println("=== DEMONSTRANDO TIME DE FUTEBOL ===");

        TimeFut time = new TimeFut("Corinthians", "São Paulo", "Ramon");

        System.out.println("Adicionando jogadores...");
        time.adicionarJogador(new Jogador("Pedro", "Zagueiro"));
        time.adicionarJogador(new Jogador("Carlos", "Atacante"));
        time.adicionarJogador(new Jogador("João", "Goleiro"));

        System.out.println("\nListando todos os jogadores:");
        time.listarJogadores();

        System.out.println("\nAdicionando mais um jogador...");
        time.adicionarJogador(new Jogador("Lucas", "Meio-campista"));

        System.out.println("\nListando todos os jogadores após adição:");
        time.listarJogadores();
        System.out.println();

        System.out.println("=== TESTANDO VACA ===");
        System.out.println();

        Vaca vaca = new Vaca(1, "Holandesa", 500, "15/02/2025");
        vaca.adicionarFilhote(new Filhote("Mimoso", 40));
        vaca.adicionarFilhote(new Filhote("Leite Ninho", 45));
        System.out.println();

        vaca.listarFilhotes();
        System.out.println();

        System.out.println("==== TESTANDO AQUÁRIO ====");

        Aquario aquarioPeixes = new Aquario();
        aquarioPeixes.adicionarPeixe("Beta");
        System.out.println();

        System.out.println("==== TESTANDO SALA DE AULA ====");

        SalaAula sala = new SalaAula(101, 5, "Matemática", "Prof. Silva");
        sala.adicionarAluno(new Aluno("João", 12345));
        sala.adicionarAluno(new Aluno("Maria", 67890));
        sala.listarAlunos();
        System.out.println();

        System.out.println("==== TESTANDO COLMEIA ====");

        Colmeia colmeia = new Colmeia("Floresta Amazônica");
        colmeia.adicionarAbelha(new Abelha("Operária"));
        colmeia.adicionarAbelha(new Abelha("Rainha"));
        colmeia.produzirMiel();
        System.out.println();

        System.out.println("==== TESTANDO COZINHA ====");

        Cozinha cozinha = new Cozinha("Restaurante Gourmet");
        cozinha.adicionarIngrediente("Alface");
        cozinha.adicionarIngrediente("Tomate");
        cozinha.cozinheiros.add(new Cozinheiro("João", "Massas"));
        cozinha.cozinheiros.add(new Cozinheiro("Maria", "Pratos Vegetarianos"));
        cozinha.prepararRefeicao();
        System.out.println();

        System.out.println("==== TESTANDO CALCULADORA ====");

        Calculadora calc = new Calculadora();
        calc.somar(10, 5);
        calc.subtrair(10, 3);
        System.out.println();

        System.out.println("==== TESTANDO COLEÇÃO DE MOEDAS ====");
        ColecaoMoedas colecao = new ColecaoMoedas();
        colecao.adicionarMoeda(new Moeda(TipoMoeda.CENTAVOS, 0.25));
        colecao.adicionarMoeda(new Moeda(TipoMoeda.DOLARES, 1.0));
        colecao.calcularValorTotal();

        System.out.println();
    }
}
