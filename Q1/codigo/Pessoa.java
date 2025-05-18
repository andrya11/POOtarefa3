package Q1;
import java.util.ArrayList;
import java.util.List;
public class Pessoa {
 private String nome;
 private List<Carro> carrosUsados;

 public Pessoa(String nome){
     this.nome = nome;
     this.carrosUsados = new ArrayList<>();
 }
 public String getNome() {
     return nome;
 }
 public List<Carro> getCarrosUsados() {
     return carrosUsados;
 }
 public void usarCarro(Carro carro){
     carrosUsados.add(carro);
     carro.Dirigir();
     System.out.println(nome + " Está usando o carro: " + carro.getModelo());

 }
}
