package Q3;

public class Computador {
    private String marca;
    private String modelo;
    private String processador;
    private int memoriaRAM;
    private PlacaMae placaMae; // Composição

    public Computador(String marca, String modelo, String processador, int memoriaRAM,
                      String fabricantePlaca, String chipset, int numSlots, String tipoMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.placaMae = new PlacaMae(fabricantePlaca, chipset, numSlots, tipoMemoria); // composição
    }

    public void exibirInformacoes() {
        System.out.println("Computador:");
        System.out.println("- Marca: " + marca);
        System.out.println("- Modelo: " + modelo);
        System.out.println("- Processador: " + processador);
        System.out.println("- Memória RAM: " + memoriaRAM + "GB");
        placaMae.exibirInformacoes();
        System.out.println();
    }

    public void atualizarPlacaMae(String fabricante, String chipset, int numSlots, String tipoMemoria) {
        placaMae.atualizar(fabricante, chipset, numSlots, tipoMemoria);
    }
}

