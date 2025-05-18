package Q3;

public class PlacaMae {
    private String fabricante;
    private String chipset;
    private int numSlots;
    private String tipoMemoria;

    public PlacaMae(String fabricante, String chipset, int numSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numSlots = numSlots;
        this.tipoMemoria = tipoMemoria;
    }

    public void atualizar(String fabricante, String chipset, int numSlots, String tipoMemoria) {
        this.fabricante = fabricante;
        this.chipset = chipset;
        this.numSlots = numSlots;
        this.tipoMemoria = tipoMemoria;
    }

    public void exibirInformacoes() {
        System.out.println("Placa-Mãe:");
        System.out.println("- Fabricante: " + fabricante);
        System.out.println("- Chipset: " + chipset);
        System.out.println("- Número de slots: " + numSlots);
        System.out.println("- Tipo de memória: " + tipoMemoria);
    }
}

