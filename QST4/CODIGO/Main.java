package Q4;

public class Main {
    public static void main(String[] args) {

        Medico m1 = new Medico("Dra. Anna", "12345", "Cardiologia");
        Paciente p1 = new Paciente("Matheus Silva", "132.856.000-00", "10/10/1910");


        Consulta c1 = new Consulta("18/05/2025", "Avaliação clínica", m1, p1);
        c1.exibirDetalhes();


        Unidade u1 = new Unidade("Pronto Socorro", 1);
        u1.adicionarMedico(m1);


        Hospital h1 = new Hospital("Hospital Central", "Av. das Torres, 37");
        h1.adicionarUnidade(u1);
    }
}
