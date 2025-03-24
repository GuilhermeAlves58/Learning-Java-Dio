package problem_set;

public class Switch {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);


        System.out.print("Digite um dia da semana (ex: segunda, terça...): ");
        String diaSemana = scanner.nextLine().toLowerCase();

        switch (diaSemana) {
            case "segunda":
                System.out.println("Número do dia: 1");
                break;
            case "terça":
                System.out.println("Número do dia: 2");
                break;
            case "quarta":
                System.out.println("Número do dia: 3");
                break;
            case "quinta":
                System.out.println("Número do dia: 4");
                break;
            case "sexta":
                System.out.println("Número do dia: 5");
                break;
            case "sábado":
                System.out.println("Número do dia: 6");
                break;
            case "domingo":
                System.out.println("Número do dia: 7");
                break;
            default:
                System.out.println("Dia inválido");
        }


        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1, 2, 3 -> System.out.println("Certo");
            case 4 -> System.out.println("Errado");
            case 5 -> System.out.println("Talvez");
            default -> System.out.println("Valor indefinido");
        }

        scanner.close();
    }
}
