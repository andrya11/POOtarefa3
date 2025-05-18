import Q1.Carro;
import Q1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa Andrya = new Pessoa("Andrya");

        Carro carro1 = new Carro("Onix");
        Carro carro2 = new Carro("Ferrari");

        Andrya.usarCarro(carro1);
        Andrya.usarCarro(carro2);
        System.out.println("\nCarros que a " + Andrya.getNome() + "já usou:");
        for (Carro carro : Andrya.getCarrosUsados()){
            System.out.println("  " + carro.getModelo());
        }

    }
}