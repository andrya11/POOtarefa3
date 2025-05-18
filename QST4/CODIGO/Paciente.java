package Q4;

public class Paciente {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public Paciente(String nome, String cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
}
