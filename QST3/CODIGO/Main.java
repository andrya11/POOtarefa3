package Q3;

public class Main {
    public static void main(String[] args) {
        Computador pc1 = new Computador(
                "Dell", "Inspiron 15", "Intel Core i7", 16,
                "ASUS", "B450", 4, "DDR4"
        );

        pc1.exibirInformacoes();

        // Atualizando dados da placa-mãe via objeto Computador
        pc1.atualizarPlacaMae("Gigabyte", "Z490", 2, "DDR4");

        System.out.println("Após atualização da placa-mãe:");
        pc1.exibirInformacoes();
    }
}
