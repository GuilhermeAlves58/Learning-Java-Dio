package problem_set.OOPJava;

// Classe principal com o método main
public class ProgramCar {
    public static void main(String[] args) {
        // Criando dois objetos Carro
        Car carro1 = new Car("Toyota", "Corolla", "Preto");
        Car carro2 = new Car("Honda", "Civic", "Branco");

        // Usando os métodos
        carro1.exibirInfo();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();

        System.out.println();

        carro2.exibirInfo();
        carro2.acelerar();
    }
}

