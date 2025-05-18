package Q1;

public class Carro {
    public String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }
    public void Dirigir(){
        System.out.println(" Dirigindo o modelo: " + modelo);
    }
}
