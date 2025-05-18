package Q4;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String nome;
    private String endereco;
    private List<Unidade> unidades;

    public Hospital(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.unidades = new ArrayList<>();
    }

    public void adicionarUnidade(Unidade unidade) {
        unidades.add(unidade);
    }
}

