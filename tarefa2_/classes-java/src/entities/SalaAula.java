package entities;

import java.util.ArrayList;
import java.util.List;

public class SalaAula {
    private int numero;
    private int capacidade;
    private String disciplina;
    private String professor;
    private List<Aluno> alunos;

    public SalaAula(int numero, int capacidade, String disciplina, String professor) {
        this.numero = numero;
        this.capacidade = capacidade;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.size() < capacidade) {
            alunos.add(aluno);
            System.out.println("Aluno adicionado: " + aluno.getNome());
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno na sala.");
        } else {
            System.out.println("Alunos na sala:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    public static void main(String[] args) {
        SalaAula sala = new SalaAula(101, 5, "Matemática", "Prof. Silva");
        sala.adicionarAluno(new Aluno("João", 12345));
        sala.adicionarAluno(new Aluno("Maria", 67890));
        sala.listarAlunos();
    }
}
