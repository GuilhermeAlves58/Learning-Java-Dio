package problem_set.OOPJava;

// Classe Carro
public class Car {
    // Atributos
    String marca;
    String modelo;
    String cor;
    int velocidade;

    // Construtor
    public Car(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0;
    }

    // Método para acelerar
    public void acelerar() {
        velocidade += 10;
        System.out.println(modelo + " acelerou para " + velocidade + " km/h.");
    }

    // Método para frear
    public void frear() {
        velocidade -= 10;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println(modelo + " freou para " + velocidade + " km/h.");
    }

    // Método para exibir informações
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
