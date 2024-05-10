import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o Scanner
        Scanner banco = new Scanner(System.in).useLocale(Locale.US);
        // Pendindo os dados do cliente e armazenado
        System.out.println("Por favor, digite o número da Agência! ");
        int numeroAgencia = banco.nextInt();
        
        System.out.println("Por favor, digite o nome da Agência!  ");
        String nomeAgencia = banco.next();

        System.out.println("Por favor, digite seu Nome! ");
        String nomeCliente = banco.next();

        System.out.println("Por favor, digite seu Saldo! ");
        Double saldoCliente = banco.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + " e seu saldo " + saldoCliente + " já está disponível para saque");
        banco.close();
    }
}
