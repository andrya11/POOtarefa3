package Q4;

import java.util.ArrayList;
import java.util.List;

public class Unidade {
    private String tipo;
    private int andar;
    private List<Medico> medicos;

    public Unidade(String tipo, int andar) {
        this.tipo = tipo;
        this.andar = andar;
        this.medicos = new ArrayList<>();
    }

    public void adicionarMedico(Medico medico) {
        medicos.add(medico);
    }
}
