package Q2;

public class Main {
    public static void main(String[] args) {
        Instrutor Marcela = new Instrutor("Marcela", "Engenharia de Software", "Marcela@email.com", 2);
        Instrutor Hugo = new Instrutor("Hugo", "Ciência da Computação", "Hudo@email.com", 8);

        Curso javaBasico = new Curso("Java Básico", 40, "Iniciante", "Introdução à linguagem Java.");
        Curso pooAvancado = new Curso("POO Avançado", 60, "Avançado", "Princípios avançados da Programação Orientada a Objetos.");

        javaBasico.adicionarInstrutor(Marcela);
        javaBasico.adicionarInstrutor(Hugo);

        pooAvancado.adicionarInstrutor(Marcela);

        javaBasico.exibirDetalhes();
        pooAvancado.exibirDetalhes();
    }
}
