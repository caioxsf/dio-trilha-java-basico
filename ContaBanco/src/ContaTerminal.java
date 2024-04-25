import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero da conta: ");
        int Numero = scanner.nextInt();

        System.out.println("Numero da agencia: ");
        String Agencia = scanner.next();

        System.out.println("Nome do cliente: ");
        String NomeCliente = scanner.next();

        System.out.println("Saldo bancario: ");
        double Saldo = scanner.nextDouble();


        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo R$" + Saldo + " já está disponível para saque");

    }
}
