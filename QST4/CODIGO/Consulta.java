package Q4;

public class Consulta {
    private String data;
    private String descricao;
    private Medico medico;
    private Paciente paciente;

    public Consulta(String data, String descricao, Medico medico, Paciente paciente) {
        this.data = data;
        this.descricao = descricao;
        this.medico = medico;
        this.paciente = paciente;
    }

    public void exibirDetalhes() {
        System.out.println("Consulta em " + data + ": " + descricao);
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Paciente: " + paciente.getNome());
    }
}
