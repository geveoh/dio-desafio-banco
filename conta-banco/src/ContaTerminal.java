import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo ao Banco Estrelinha!");
        System.out.println("************************");

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
    
        System.out.println("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o seu nome completo: ");
        String nome = sc.next();

        System.out.println("Por favor, invente o seu saldo: ");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
        

        

    }
}
