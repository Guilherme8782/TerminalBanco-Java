import java.util.Scanner;

public class BancoTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saldoConta = 25;

        System.out.println("Digite quanto você quer sacar");
        System.out.println("Seu saldo é de " + saldoConta);
        int resgateCliente = scanner.nextInt();

        if (resgateCliente > saldoConta) {
            System.out.println("Você não possui crédito para sacar, Tente Novamente");
        } else {
            int totalConta = saldoConta - resgateCliente;
            System.out.println("Saque feito com sucesso, o saldo atual é de: " + totalConta);
        }
    }
} 