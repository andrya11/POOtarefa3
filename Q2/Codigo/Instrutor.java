package Q2;

public class Instrutor {
    private String nome;
    private String formacao;
    private String email;
    private int anosExperiencia;

    public Instrutor(String nome, String formacao, String email, int anosExperiencia) {
        this.nome = nome;
        this.formacao = formacao;
        this.email = email;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getEmail() {
        return email;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void exibirInformacoes() {
        System.out.println("- " + nome + " | " + formacao + " | " + email + " | " + anosExperiencia + " anos");
    }
}
