import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        ContaTerminal conta1=new ContaTerminal();
        System.out.println("Siga os passos para criar uma conta no nosso banco");
        System.out.println("Digite seu nome");
        conta1.setNomeCliente(scanner.nextLine());
        System.out.println(conta1.getNomeCliente());
        System.out.println("Digite seu cpf");
        conta1.setCpf(scanner.nextInt());
        System.out.println("Qual valor deseja depositar?");
        conta1.depositar(scanner.nextDouble());
        conta1.setNumeroConta(random.nextInt(9999)+1000);
        System.out.println("Numero da agencia");
        conta1.setAgencia(scanner.next());
        conta1.depositar(scanner.nextDouble());

        System.out.println(conta1.toString());

    }
}