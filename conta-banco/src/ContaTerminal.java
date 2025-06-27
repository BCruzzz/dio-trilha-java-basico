import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //Classe scanner para receber os valores pelo usuario via terminal
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String name = scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        String agency = scanner.next();

        System.out.println("Digite o número da conta: ");
        int accountNumber = scanner.nextInt();

        System.out.println("Digite o seu saldo atual: ");
        float balance = scanner.nextFloat();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");


       }
    }
