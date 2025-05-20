import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de saques com limite");
        System.out.println("Ola sernhor(a), nosso banco solicita que vocé deixe predefinido um limite de  saques diarios para sua segurança.");
        System.out.println("Qual valor deseja colocar como seu limite?");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            System.out.println("Para prosseguirmos com o saque informe o valor que deseja sacar");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("O valor ultrapassa o limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                limiteDiario=limiteDiario-valorSaque;
                System.out.println("Saque de:"+valorSaque+"R$ valor de limite restante:"+limiteDiario+"R$");

                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}